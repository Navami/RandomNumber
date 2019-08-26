package com.random.number.service;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

import org.springframework.stereotype.Service;

@Service
public class GenerateSecureRandomNumber {
	public int generateSecureRandomNumber() {
		SecureRandom secureRandomNumber = new SecureRandom();
		try {
			secureRandomNumber = SecureRandom.getInstance("SHA1PRNG");
		} catch (NoSuchAlgorithmException e) {
			System.out.println("NoSuchAlgorithmException");
		}
		return secureRandomNumber.nextInt();
	}
}
