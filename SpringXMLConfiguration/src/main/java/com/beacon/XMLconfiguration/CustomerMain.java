package com.beacon.XMLconfiguration;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomerMain {

	public static void main(String[] args) {

		try (AbstractApplicationContext appContext= 
				new ClassPathXmlApplicationContext("ApplicationContext.xml")){
			
			Customer customer = (Customer) appContext.getBean("customerBean");
			System.out.println(customer);
		}
	}
}
