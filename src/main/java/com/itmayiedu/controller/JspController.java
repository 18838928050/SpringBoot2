/**
 * @copy right Stateally Interactive Company All rights reserved
 *
 * @Title: JspController.java 
 *
 * @Date:  2019年7月15日  下午4:52:24
 *
 * @Package springboot_jsp
 */


package com.itmayiedu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 付慧芳
 * 
 * 日期：2019年7月15日 下午4:52:24
 *
 * 描述：
 * @version V1.0
 *
 */
@Controller
public class JspController {

	@RequestMapping("/jspIndex")
	public String jspIndex(){
		return "jspIndex";
		
	}
	
	
}
