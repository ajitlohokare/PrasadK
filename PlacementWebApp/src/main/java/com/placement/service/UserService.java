package com.placement.service;

import com.placement.model.User;

public interface UserService {
	
	public User createUser(User user);
	
	public boolean checkEmail(String email_id);
}
