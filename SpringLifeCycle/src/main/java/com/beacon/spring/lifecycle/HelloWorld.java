package com.beacon.spring.lifecycle;

import org.springframework.stereotype.Component;

@Component ("helloWorldBean")
public class HelloWorld {
	String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public void init() {
		System.out.println("Initializing Bean");
	}
	
	public void destroy() {
		System.out.println("Destroying Bean");
	}

}
