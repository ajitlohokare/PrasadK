package com.placement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.placement.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
	
	public boolean existsByEmail(String email_id);
}
