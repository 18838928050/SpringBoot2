/**
 * @copy right Stateally Interactive Company All rights reserved
 *
 * @Title: GlobalExceptionHandler.java 
 *
 * @Date:  2019年7月15日  下午5:32:30
 *
 * @Package springboot_jsp
 */


package com.itmayiedu.error;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 付慧芳
 * 
 * 日期：2019年7月15日 下午5:32:30
 *
 * 描述：
 * @version V1.0
 *
 */
@ControllerAdvice(basePackages = "com.itmayiedu.controller")
public class GlobalExceptionHandler {

	@ExceptionHandler(RuntimeException.class)
	@ResponseBody //表示返回json格式  //modelAndView返回视图页面
	public Map<String, Object> errorJSON(){
		Map<String, Object> errorResultMap=new HashMap<>();
		errorResultMap.put("errorCode", "500");
		errorResultMap.put("errorMsg", "系统错误22");
		return errorResultMap;
	}
}
