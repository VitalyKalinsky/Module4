package com.kalin.spring_app;

public class HelloBean {
	private String message;
	public HelloBean(String message) {
		this.message = message;
	}
	public String getMessage() {
		return message;
	}
}
