package com.placement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.placement.model.User;
import com.placement.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userrepo;
	
	@Override
	public User createUser(User user) {
		
		return userrepo.save(user);
	}

	@Override
	public boolean checkEmail(String email_id) {
		
		return userrepo.existsByEmail(email_id);
	}

	
}
