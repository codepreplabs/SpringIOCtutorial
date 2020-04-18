package com.codepreplabs.bean;

import javax.inject.Named;

@Named
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
