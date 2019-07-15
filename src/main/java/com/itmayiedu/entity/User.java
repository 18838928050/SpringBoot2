/**
 * @copy right Stateally Interactive Company All rights reserved
 *
 * @Title: User.java 
 *
 * @Date:  2019年7月15日  下午6:50:00
 *
 * @Package com.itmayiedu.entity
 */


package com.itmayiedu.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

/**
 * @author 付慧芳
 * 
 * 日期：2019年7月15日 下午6:50:00
 *
 * 描述：
 * @version V1.0
 *
 */

@Slf4j
@Getter
@Setter
public class User {
	
	private String name;
	private Integer age;
	
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}


	public static void main(String[] args) {
		User user=new User();
		user.setAge(23);
		user.setName("大美女");
		System.out.println(user.toString());
		log.info("hhhhh");
	}
	

}
