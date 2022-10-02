package com.sambit.controller;

import com.sambit.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Project : OnlineEducation
 * @Auther : Sambit Kumar Pradhan
 * @Created On : 02/10/2022 - 5:37 PM
 */
@Controller
public class LoginController {

	@Autowired
	private MainService mainService;

	@PostMapping(value = "/login")
	public String login(@RequestParam("email") String email, @RequestParam("password") String password) {
		System.out.println("Inside Login Method POST------->>");
		System.out.println("Email : " + email + " Password : " + password);
		return "Dashboard";
	}
}
