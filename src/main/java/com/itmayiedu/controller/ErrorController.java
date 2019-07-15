/**
 * @copy right Stateally Interactive Company All rights reserved
 *
 * @Title: ErrorController.java 
 *
 * @Date:  2019年7月15日  下午5:23:47
 *
 * @Package springboot_jsp
 */


package com.itmayiedu.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**全局捕获异常案例
 * @author 付慧芳
 * 
 * 日期：2019年7月15日 下午5:23:47
 *
 * 描述：
 * @version V1.0
 *
 */

@RestController
public class ErrorController {

	@RequestMapping("/getUser")
	public String getUser(int i){
		int j=1/i;
		return "success";
	}
			
}
