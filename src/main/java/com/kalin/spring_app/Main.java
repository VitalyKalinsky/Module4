package com.kalin.spring_app;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Main {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		HelloBean bean = context.getBean(HelloBean.class);
		System.out.println(bean.getMessage());
		context.close();
	}
}
