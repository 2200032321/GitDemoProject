package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;


public interface UserInterface extends JpaRepository<User, String>{
	
	public User findByEmail(String email);
}