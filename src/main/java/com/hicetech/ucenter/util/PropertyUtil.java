package com.hicetech.ucenter.util;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

import org.apache.log4j.Logger;

public class PropertyUtil {
	
	private static final Logger logger = Logger.getLogger(PropertyUtil.class);
	
	public static Properties readValue(String path){
		Class<PropertyUtil> clazz = PropertyUtil.class;
		InputStreamReader inputStram = new InputStreamReader(clazz.getResourceAsStream("/"+path));
		Properties properties = new Properties();
		try {
			properties.load(inputStram);
		} catch (IOException e) {
			logger.info("load properties failure...");
		}finally{
			try {
				inputStram.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return properties;
	}
}
