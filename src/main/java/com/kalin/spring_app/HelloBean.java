package com.kalin.spring_app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class HelloBean {
	private String message;
	public HelloBean(@Value("hello") String message) {
		this.message = message;
	}
	public String getMessage() {
		return message;
	}
}
