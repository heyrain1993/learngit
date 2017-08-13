package com.hicetech.ucenter;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication(scanBasePackages={"com.hicetech.*"})
@MapperScan("com.hicetech.ucenter.dao")
public class Application 
{
    public static void main( String[] args )
    {
       SpringApplication.run(Application.class, args); 
    }
    
    @Bean
    public RestTemplate restTemplate(){
    	
    	return new RestTemplate();
    }
}
