package com.sambit.controller;

import com.sambit.model.Register;
import com.sambit.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Project : OnlineEducation
 * @Auther : Sambit Kumar Pradhan
 * @Created On : 02/10/2022 - 8:53 PM
 */
@Controller
public class AdminController {
	@Autowired
	private MainService mainService;

}
