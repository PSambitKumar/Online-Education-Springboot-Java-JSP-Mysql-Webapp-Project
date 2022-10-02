package com.sambit.controller;

import com.sambit.model.Register;
import com.sambit.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

/**
 * @Project : OnlineEducation
 * @Auther : Sambit Kumar Pradhan
 * @Created On : 02/10/2022 - 2:30 PM
 */
@Controller
public class MainController {

	@Autowired
	private MainService mainService;


	@GetMapping(value = {"/home", "/"})
	public String home() {
		System.out.println("Inside Home Method------->>");
		return "Home";
	}

	@GetMapping(value = "/login")
	public String login(@RequestParam(value = "response", required = false) String response, Model model) {
		System.out.println("Inside Login Method------->>");
		model.addAttribute("response", response);
		return "Login";
	}

	@GetMapping(value = "/register")
	public String register(Model model) {
		System.out.println("Inside Register Method------->>");
		model.addAttribute("response", null);
		return "Register";
	}

	@PostMapping(value = "/register")
	public String register(Register register, Model model,
	                       @RequestParam("profileImage") MultipartFile profileImage) {
		System.out.println("Inside Register Method------->>");
		System.out.println("Register Data : " + register);
		System.out.println("Profile Image : " + profileImage);
		try {
			register = mainService.saveRegister(register);
			if (register != null && register.getRegisterId() > 0) {
				return "redirect:/login?response=Registration Successfull";
			} else {
				model.addAttribute("response", "Registration Failed");
				return "Register";
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@PostMapping(value = "/dashboard")
	public String dashboard(@RequestParam(value = "registerId", required = false) String registerId, Model model) {
		System.out.println("Inside Dashboard Method------->>");
		System.out.println("Register Id : " + registerId);
		Register register = mainService.getRegisterById(Integer.parseInt(registerId));
		if (register != null && register.getRegisterId() > 0 && register.getUserType().equals("ADMIN")) {
			model.addAttribute("userType", "ADMIN");
			model.addAttribute("data", register);
			return "Dashboard";
		} else if (register != null && register.getRegisterId() > 0 && register.getUserType().equals("STUDENT")) {
			model.addAttribute("userType", "STUDENT");
			model.addAttribute("data", register);
			return "Dashboard";
		} else {
			return "redirect:/login?response=Something Went Wrong";
		}
	}
}
