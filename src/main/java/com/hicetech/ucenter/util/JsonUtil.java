package com.hicetech.ucenter.util;

import java.io.IOException;

import org.apache.log4j.Logger;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonUtil {
	
	private static final Logger logger = Logger.getLogger(JsonUtil.class);
	
	public static <T> String write(T t){
		ObjectMapper mapper = new ObjectMapper();
		String value = null;
		try {
			value = mapper.writeValueAsString(t);
		} catch (JsonProcessingException e) {
			logger.error("transfer object to string failure...");
		}
		return value;
	} 
	
	public static <T> T read(String value,Class<T> clazz){
		ObjectMapper mapper = new ObjectMapper();
		T t = null;
		try {
			t = mapper.readValue(value, clazz);
		} catch (IOException e) {
			logger.error("transfer string to object failure...");
		}
		return t;
	}
}
