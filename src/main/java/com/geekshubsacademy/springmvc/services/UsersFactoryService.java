package com.geekshubsacademy.springmvc.services;

import java.util.ArrayList;
import java.util.List;

import com.geekshubsacademy.springmvc.models.User;

public interface UsersFactoryService {

	public default List<User> getUsers(){
			List<User> users = new ArrayList<>();
			users.add(new User("xavi","123"));
			users.add(new User("mike","123"));
			users.add(new User("alice","123"));
			return users;
	}
	
	
}
