package com.jiguru.vamshi.services.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jiguru.vamshi.entities.Users;
import com.jiguru.vamshi.exceptions.ResourceNotFoundException;
import com.jiguru.vamshi.payloads.UserDto;
import com.jiguru.vamshi.repositories.UserRepo;
import com.jiguru.vamshi.services.UserService;


@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepo userRepo;
	
	@Autowired
	private ModelMapper modelMapper;

	@Override
	public UserDto createUser(UserDto userDto) {
		Users user = this.dtoToUser(userDto);

		Users saveUser = this.userRepo.save(user);

		return this.userToDto(saveUser);
	}

//	@Override
//	public UserDto UpdateUser(UserDto userDto, Integer userId) {
//
//		Users user = this.userRepo.findById(userId)
//				.orElseThrow(() -> new ResourceNotFoundException("User", "Id", userId));
//
//		user.setName(userDto.getName());
//		user.setEmail(userDto.getEmail());
//		user.setPassword(userDto.getPassword());
//		user.setAbout(userDto.getAbout());
//
//		Users updateUser = this.userRepo.save(user);
//		UserDto updateUserDto = this.userToDto(updateUser);
//
//		return updateUserDto;
//	}

	@Override
	public UserDto getUserById(Integer userId) {
		Users user = this.userRepo.findById(userId)
				.orElseThrow(() -> new ResourceNotFoundException("User", "Id", userId));
		UserDto dto = this.userToDto(user);
		return dto;
	}

	@Override
	public List<UserDto> getAllUsers() {

		List<Users> users = this.userRepo.findAll();

		List<UserDto> userDtos = users.stream().map(user -> this.userToDto(user)).collect(Collectors.toList());
		return userDtos;
	}

	@Override
	public void deleteUser(Integer userId) {
		Users user=  this.userRepo.findById(userId).orElseThrow(() -> new ResourceNotFoundException("User", "Id", userId));
		this.userRepo.delete(user);
	}

	private Users dtoToUser(UserDto userDto) {
		Users user = this.modelMapper.map(userDto, Users.class);
//		user.setId(userDto.getId());
//		user.setName(userDto.getName());
//		user.setEmail(userDto.getEmail());
//		user.setPassword(userDto.getPassword());
//		user.setAbout(userDto.getAbout());
		return user;
	}

	private UserDto userToDto(Users user) {
		UserDto userDto = this.modelMapper.map(user,UserDto.class);
//		userDto.setId(user.getId());
//		userDto.setName(user.getName());
//		userDto.setEmail(user.getEmail());
//		userDto.setPassword(user.getPassword());
//		userDto.setAbout(user.getAbout());
		return userDto;
	}

	@Override
	public UserDto UpdateUser(UserDto user, Integer userId) {
		// TODO Auto-generated method stub
		return null;
	}

}
