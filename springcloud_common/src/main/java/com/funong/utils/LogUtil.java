package com.funong.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * log工具类
 * @author khum
 * todo
 */
public class LogUtil {

	private static Logger logger ;
	public static void info(Class<?> kClass,String message,Throwable t){
		logger = LoggerFactory.getLogger(kClass);
		logger.info(message, t);
	}
	
}
