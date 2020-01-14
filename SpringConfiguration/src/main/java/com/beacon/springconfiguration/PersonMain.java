package com.beacon.springconfiguration;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonMain {

	public static void main(String[] args) {

		ConfigurableApplicationContext appContext = 
				new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		Person person = (Person) appContext.getBean("personBean");
		
		System.out.println(person.getName());
		System.out.println(person.getAge());
		
		appContext.close();

	}

}
