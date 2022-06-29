package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.LoginDto;
import com.example.demo.dto.UserDto;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/login")
	public User login(@RequestBody LoginDto loginDto) {
		User loggedInUser = userService.loginUser(loginDto);
		if(loggedInUser == null) {
			return null;
		}
		return loggedInUser;
	}
	
	@PostMapping("/saveUser")
	public String saveUser(@RequestBody UserDto user) {
		userService.saveUser(user);
		return "Success"; 
	}

}
