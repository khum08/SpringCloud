package com.funong.aspect;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 利用aop打印所有网络日志
 * 此方案是否可行需重新思考
 * @author khum
 *
 */
//@Aspect
//@Component //注册到spring容器中
public class HttpLogger {
	
	public static final String POINT_CUT= "execution(* com.funong.khum.controller..*(..))";
	public static final String POINT_CUT_M= "log()";
	
	private static final Logger logger = LoggerFactory.getLogger(HttpLogger.class);
	
//	@Pointcut(POINT_CUT)
	public void log(){}
	
//	@Before(POINT_CUT_M)
	public void requestLog(){
		logger.error("request");
	}
	
//	@After(POINT_CUT_M)
	public void doAfter(){
		
	}
	
//	@AfterReturning(returning = "object", pointcut = POINT_CUT_M)
	public void responeLog(Object object){
		logger.error("response");
	}
	

}

