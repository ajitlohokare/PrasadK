package com.placement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.placement.model.User;
import com.placement.service.UserService;

import jakarta.servlet.http.HttpSession;

@Controller
public class RegisterController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/register")
	public String regHome(Model model)
	{
		model.addAttribute("user",new User());
		return "register";
	}
	
	@PostMapping("/register")
	public String createUser(@ModelAttribute User user , HttpSession session) {
		
		//System.out.println(user);
		
		//check user is exist or not
		boolean f=userService.checkEmail(user.getEmail_id());
		
		if(f)
		{
			//System.out.println("Email id already exist");
			// session will display on frontend
			session.setAttribute("msg", "Email id already exist");
		}else {
			
			//if user is not Exist then Create a user
			 User users=userService.createUser(user);
			 if(users!=null)
			 {
				 //System.out.println("Register Successfully");
				 session.setAttribute("msg", "Register Successfully");
			 }else {
				 //System.out.println("Something wrong on server");
   				 session.setAttribute("msg", "Something wrong on server");
			 }
			
		}
		 
		return "redirect:/register";
	}
	
}
