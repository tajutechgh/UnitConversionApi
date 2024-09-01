package com.tajutechgh.unitconversion.api.repo;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class PasswordGenerator {

	public static void main(String[] args) {
		
		PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		
		String rawPassword = "doedoe";
		
		String encodedPassword = passwordEncoder.encode(rawPassword);
		
		System.out.println(encodedPassword);
	}
}