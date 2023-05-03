package com.placement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import com.placement.model.User;
import com.placement.repository.UserRepository;

@Service
public class UserDetailsServiceImpl {
		
	@Autowired
	private UserRepository userRepository;
	
//	public UserDetails loadUserByEmail(String email_id)throws EmailNotFoundException{
//	
//		User user=userRepository.findByEmail(email_id);
//		if(user == null) {
//			throw new EmailNotFoundException("Email not found");
//		}
//		return new org.springframework.security.core.userdetails.User(user.getEmail_id(), user.getPassword(), user.getRole());
//	}
	
	
}
