package com.placement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.placement.model.User;
import com.placement.service.UserService;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping
@ComponentScan(basePackages = "com.placement.controller")
public class HomeController {
	
	@Autowired
	private UserService userService;
		
	@GetMapping("/")
	public String home()
	{
		return "index";
	}
	
	@GetMapping("/signin")
	public String login()
	{
		return "index";
	}
	
	@GetMapping("/register")
	public String register() {
		return "register";
	}
	
	
	@GetMapping("/forms-onboarding")
	  public String onboard() {
	    return "admin/forms-onboarding";
	  }
	
//	@PostMapping("/register")
//	public String createUser(@ModelAttribute User user , HttpSession session) {
//		
//		//System.out.println(user);
//		
//		//check user is exist or not
//		boolean f=userService.checkEmail(user.getEmail_id());
//		
//		if(f)
//		{
//			//System.out.println("Email id already exist");
//			// session will display on frontend
//			session.setAttribute("msg", "Email id already exist");
//		}else {
//			
//			//if user is not Exist then Create a user
//			 User users=userService.createUser(user);
//			 if(users!=null)
//			 {
//				 //System.out.println("Register Successfully");
//				 session.setAttribute("msg", "Register Successfully");
//			 }else {
//				 //System.out.println("Something wrong on server");
//   				 session.setAttribute("msg", "Something wrong on server");
//			 }
//		}
//		 
//		return "redirect:/register";
//	}
	
}
