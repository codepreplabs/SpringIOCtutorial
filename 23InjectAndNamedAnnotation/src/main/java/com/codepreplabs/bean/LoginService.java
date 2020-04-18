package com.codepreplabs.bean;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class LoginService {

	int loginAttempts;

	@Inject
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
