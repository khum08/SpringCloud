package com.funong.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseBody;

import com.funong.model.Response;
import com.funong.utils.ResponseFormatUtil;

/**
 * 捕捉其他代码中抛出的异常
 * @author khum
 *
 */
@ControllerAdvice
public class GlobalExceptionHandler {
	
	private static final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);
	
	@org.springframework.web.bind.annotation.ExceptionHandler(value = Exception.class)
	@ResponseBody
	public Response handle(Exception e){
		if(e instanceof AccessException){
			AccessException exception = (AccessException)e;
			return ResponseFormatUtil.error(exception.getStatus(),exception.getMessage());
		}else{
			logger.error("系统错误",e);
			return ResponseFormatUtil.error(ExceptionEnum.HTTP_UNKNOW);
		}
	}

}



