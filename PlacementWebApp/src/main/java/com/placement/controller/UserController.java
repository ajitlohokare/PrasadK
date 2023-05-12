package com.placement.controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user/")
@ComponentScan(basePackages = "com.placement.controller")
public class UserController {
	
	@GetMapping("/")
	public String home() {
		
		return "user/home";
	}

}
