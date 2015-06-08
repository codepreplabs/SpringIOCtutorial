package com.codepreplabs.bean;


public class LoginDAO {

	public boolean validateLogin(String username, String password) {
		if (username.equalsIgnoreCase("hello")
				&& password.equalsIgnoreCase("world")) {
			return true;
		} else {
			return false;
		}

	}
}
