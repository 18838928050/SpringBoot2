/**
 * @copy right Stateally Interactive Company All rights reserved
 *
 * @Title: MemberService.java 
 *
 * @Date:  2019年7月15日  下午8:28:10
 *
 * @Package com.itmayiedu.service
 */


package com.itmayiedu.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

/**
 * @author 付慧芳
 * 
 * 日期：2019年7月15日 下午8:28:10
 *
 * 描述：
 * @version V1.0
 *
 */
@Service
@Slf4j
public class MemberService {

	@Async  //相当于这个方法重新开辟了单独线程在执行
	//思路：使用AOP技术在运行时 创建一个单独的线程在执行
	public String addMemberAndEmail(){
		log.info("2");
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		log.info("3"); 
		return "itemayiedu";
		
	}
}
