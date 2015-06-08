package com.codepreplabs.bean;

import org.springframework.stereotype.Repository;

@Repository
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
