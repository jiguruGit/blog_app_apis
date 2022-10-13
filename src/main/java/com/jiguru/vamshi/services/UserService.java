package com.jiguru.vamshi.services;

import java.util.List;

import com.jiguru.vamshi.payloads.UserDto;

public interface UserService {
	
	UserDto createUser(UserDto user);
	
	UserDto UpdateUser(UserDto user,Integer userId);
	
	UserDto getUserById(Integer userId);
	
	List<UserDto> getAllUsers();
	
	void deleteUser(Integer userId);
	
}
