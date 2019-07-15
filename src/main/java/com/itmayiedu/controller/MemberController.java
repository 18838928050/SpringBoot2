/**
 * @copy right Stateally Interactive Company All rights reserved
 *
 * @Title: MemberController.java 
 *
 * @Date:  2019年7月15日  下午8:27:24
 *
 * @Package com.itmayiedu.controller
 */


package com.itmayiedu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itmayiedu.service.MemberService;

import lombok.extern.slf4j.Slf4j;

/**
 * @author 付慧芳
 * 演示springboot异步调用
 * 日期：2019年7月15日 下午8:27:24
 *
 * 描述：
 * @version V1.0
 *
 */
@RestController
@Slf4j
public class MemberController {

	@Autowired
	private MemberService memberService;
	
	@Value("${http_url}")
	private String http_url;
	
	@RequestMapping("/abc")
	public String addMemberAndEmail(){
		log.info("1");
	String result=	memberService.addMemberAndEmail();
		log.info("4");
		
		return "result="+result;
	}
	
	

	/**
	 * @return the http_url
	 */
	@RequestMapping("/getName")
	public String getHttp_url() {
		return http_url;
	}
	
}
