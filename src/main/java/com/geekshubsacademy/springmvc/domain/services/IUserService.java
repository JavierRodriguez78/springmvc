package com.geekshubsacademy.springmvc.domain.services;

import java.util.List;
import java.util.Optional;

import com.geekshubsacademy.springmvc.domain.entities.User;

public interface IUserService {
	public List<User> findAll();
	public void save(User user);
	public Optional<User> findOne(Long id);
	public void delete(Long id);
}
