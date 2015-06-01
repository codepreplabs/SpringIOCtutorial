package com.codepreplabs.bean;

public class InnerBean {

	private String message;
	
	public InnerBean() {

	}

	public InnerBean(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
