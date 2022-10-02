package com.sambit.controller;

import com.sambit.model.Register;
import com.sambit.service.LoginService;
import com.sambit.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.swing.plaf.synth.Region;

/**
 * @Project : OnlineEducation
 * @Auther : Sambit Kumar Pradhan
 * @Created On : 02/10/2022 - 5:37 PM
 */
@Controller
public class LoginController {

	@Autowired
	private MainService mainService;
	@Autowired
	private LoginService loginService;

	@PostMapping(value = "/login")
	public String login(@RequestParam("email") String email,
	                    @RequestParam("password") String password, Model model) {
		System.out.println("Inside Login Method POST------->>");
		System.out.println("Email : " + email + " Password : " + password);
		String userType = loginService.checkLoginType(email, password);
		Register register = mainService.chekLogin(email, password);
		if (userType.equals("ADMIN")) {
			System.out.println("Inside Admin Login");
			model.addAttribute("userType", userType);
			model.addAttribute("data", register);
		} else if (userType.equals("USER")) {
			System.out.println("Inside User Login");
			model.addAttribute("userType", userType);
			model.addAttribute("data", register);
		} else {
			return "redirect:/login?response=Invalid Username or Password";
		}
		return "Dashboard";
	}
}
