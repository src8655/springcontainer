package com.cafe24.springcontainer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cafe24.springcontainer.user.User;

import config.user.UserConfig01;

public class JavaConfigTest01 {
	public static void main(String[] args) {
		testUser01();
		testUser02();
	}

	
	private static void testUser01() {
		ApplicationContext appCtx = new AnnotationConfigApplicationContext(UserConfig01.class);
		
		User user = appCtx.getBean(User.class);
		System.out.println(user);
		
		((ConfigurableApplicationContext)appCtx).close();
	}
	
	//어플리케이션 컨텍스트 매개변수에 클래스가 아닌 패키지
	private static void testUser02() {
		ApplicationContext appCtx = new AnnotationConfigApplicationContext("config.user");
		
		User user = appCtx.getBean(User.class);
		System.out.println(user);
		
		((ConfigurableApplicationContext)appCtx).close();
	}
}
