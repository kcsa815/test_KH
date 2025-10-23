package org.embed.service;

import java.util.List;

import org.embed.domain.UserDto;
import org.embed.repository.UserMapper;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {
	
	private final UserMapper userMapper;
	
	public void registerUser(UserDto user) {
		userMapper.insertUser(user);
	}
	
	public UserDto getUserById(int id) {
		return userMapper.findById(id);
	}
	
	public UserDto getUserByUsername(String username) {
		return userMapper.findByUsername(username);
	}
	
	public List<UserDto> getAllUser(){
		return userMapper.findAll();
	}
	
	
}
