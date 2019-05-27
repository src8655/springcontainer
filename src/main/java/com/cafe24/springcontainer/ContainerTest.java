package com.cafe24.springcontainer;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.cafe24.springcontainer.user.User;
import com.cafe24.springcontainer.user.User1;

public class ContainerTest {

	public static void main(String[] args) {
		testApplicationContext();
	}
	
	public static void testApplicationContext() {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config/user/applicationContext2.xml");
		
		//오류 : 빈설정 id나 name 설정을 해야한다.
		User1 user = (User1)applicationContext.getBean("user1");
		System.out.println(user.getName());
		
		user = applicationContext.getBean(User1.class);
		System.out.println(user.getName());

		
		User user1 = (User)applicationContext.getBean("user");
		user1.setName("test");
		System.out.println(user1+"::");
		
		User user1s = (User)applicationContext.getBean("user");
		System.out.println(user1s+"::");
		
		
		
		
		user1 = (User)applicationContext.getBean("usr");
		System.out.println(user1);
		
		//user1 = applicationContext.getBean(User.class);
		

		user1 = (User)applicationContext.getBean("usr2");
		System.out.println(user1);
		

		user1 = (User)applicationContext.getBean("usr3");
		System.out.println(user1);
		

		user1 = (User)applicationContext.getBean("usr4");
		System.out.println(user1);
		
		
		((ConfigurableApplicationContext)applicationContext).close();
		
	}
	
	public static void testBeanFactory() {
		BeanFactory bf1 = new XmlBeanFactory(new ClassPathResource("config/user/applicationContext.xml"));
		
		//scanning 을 통한 auto configuration
		User1 user = (User1)bf1.getBean("user1");
		System.out.println(user.getName());
		

		BeanFactory bf2 = new XmlBeanFactory(new ClassPathResource("config/user/applicationContext2.xml"));
		
		User1 user2 = (User1)bf2.getBean("user1");
		System.out.println(user2.getName());
		
		user2 = bf2.getBean(User1.class);
		System.out.println(user2.getName());
		
	}
}
