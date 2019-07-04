package com.geekshubsacademy.springmvc.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.geekshubsacademy.springmvc.models.User;
import com.geekshubsacademy.springmvc.services.UsersFactoryService;

@Service("UsersFactoryService")
public class UsersFactoryServiceImpl implements UsersFactoryService {
	
	@Override
	public List<User> getUsers(){
		List<User> users = new ArrayList<>();
		users.add(new User("Alice","123"));
		users.add(new User("Peter","234"));
		return users;
		
	}
}
