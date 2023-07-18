package com.blogapp.blog.services;

import java.util.List;

import com.blogapp.blog.payloads.UserDto;

public interface UserService {
	UserDto registerNewUser(UserDto user);
	UserDto createUser(UserDto user);

	UserDto updateUser(UserDto user, Integer userId);

	UserDto geUserById(Integer userId);

	List<UserDto> getAllUsers();

	void deleteUser(Integer userId);
}
