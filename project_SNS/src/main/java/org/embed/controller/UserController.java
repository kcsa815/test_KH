package org.embed.controller;

import java.util.List;

import org.embed.domain.UserDto;
import org.embed.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

	private final UserService userService;
	
	//회원 등록
	@PostMapping
	public String registerUser(@RequestBody UserDto user) {
		userService.registerUser(user);
		return "User registered successfully!";
	}
	
	//회원 전체 조회
	@GetMapping
	public List<UserDto> getAllUsers(){
		return userService.getAllUser();
	}
	
	
	//아이디로 조회
	@GetMapping("/{id}")
	public UserDto getUserById(@PathVariable int id) {
		return userService.getUserById(id);
	}
	
	//유저네임으로 조회
	@GetMapping("/name/{username}")
	public UserDto getUserByUsername(@PathVariable String username) {
		return userService.getUserByUsername(username);
	}
	
}



















