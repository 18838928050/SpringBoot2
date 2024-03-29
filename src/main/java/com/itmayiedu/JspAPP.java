package com.itmayiedu;
/**
 * @copy right Stateally Interactive Company All rights reserved
 *
 * @Title: JspAPP.java 
 *
 * @Date:  2019年7月15日  下午5:07:03
 *
 * @Package springboot_jsp
 */


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * @author 付慧芳
 * 
 * 日期：2019年7月15日 下午5:07:03
 *
 * 描述：
 * @version V1.0
 *
 */
@SpringBootApplication
@EnableAsync  //开启异步调用
public class JspAPP {

	public static void main(String[] args) {
		SpringApplication.run(JspAPP.class, args);
	}
}
