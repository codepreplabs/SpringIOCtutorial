package com.codepreplabs.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

	int loginAttempts;

	@Autowired
	LoginDAO loginDAO;
	boolean isValid;

	public String validateLogin(String username, String password) {
		if (loginAttempts < 3) {
			isValid = loginDAO.validateLogin(username, password);
		} else {
			System.out
					.println("Account disabled due to incorrect credentials contact Administrator");
		}

		if (isValid) {

			return "Successful login";
		} else {

			loginAttempts = loginAttempts++;
			return "Failed to login";
		}
	}
}
