/**
 * 
 */
package com.random.number.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.random.number.service.GenerateSecureRandomNumber;

/**
 * @author Navami Ramamurthy
 *
 */

@Controller
public class RandomNumberController {
	@Autowired
	GenerateSecureRandomNumber generateSecureRandomNumber;
	@RequestMapping(method = RequestMethod.GET, value = "/generateRandomNumber")
	@ResponseBody
	public int getRandomNumber() {
		return generateSecureRandomNumber.generateSecureRandomNumber();
	}
}
