package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.LoginDto;
import com.example.demo.dto.UserDto;
import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public User loginUser(LoginDto loginDto) {
		String email = loginDto.getEmail();
		System.out.println(email);
		
		User dbUser = userRepository.findByEmail(email);
		
		if(dbUser.getPassword().equals(loginDto.getPassword())) {
			return dbUser;
		}else {
			return null;
		}
		
	}

	public void saveUser(UserDto userDto) {
		User user = new User();
		user.setEmail(userDto.getEmail());
		user.setPassword(userDto.getPassword());
		user.setUsername(userDto.getUsername());
		userRepository.save(user);
	}

}
