package com.codepreplabs.to;

public class BaseTOImpl implements BaseTO {

	private String message = "This is from the BaseTOImpl";

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
