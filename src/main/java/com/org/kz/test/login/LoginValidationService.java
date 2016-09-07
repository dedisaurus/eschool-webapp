package com.org.kz.test.login;

import org.springframework.stereotype.Service;

@Service
public class LoginValidationService {

		public boolean isUserValid(String name, String password){
			if(name.equals("admin")&& password.equals("password")){
				return true;
			}
			return false;	
		}
}
