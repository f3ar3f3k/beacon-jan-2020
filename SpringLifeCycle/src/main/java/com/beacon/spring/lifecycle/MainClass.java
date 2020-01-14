package com.beacon.spring.lifecycle;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		System.out.println("Initialization and Destroy Methods Implementation..\n");
		ConfigurableApplicationContext context = 
				new ClassPathXmlApplicationContext("ApplicationContext.xml");
		HelloWorld obj =(HelloWorld) context.getBean("helloWorldBean");
		System.out.println(obj.getMessage());
		context.registerShutdownHook();
		context.close();

	}

}
