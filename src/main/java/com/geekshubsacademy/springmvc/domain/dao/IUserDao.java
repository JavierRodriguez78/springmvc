package com.geekshubsacademy.springmvc.domain.dao;

import org.springframework.data.repository.CrudRepository;

import com.geekshubsacademy.springmvc.domain.entities.User;

public interface IUserDao extends CrudRepository<User, Long> {

}
