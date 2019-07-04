package com.geekshubsacademy.springmvc.domain.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.geekshubsacademy.springmvc.domain.dao.IUserDao;
import com.geekshubsacademy.springmvc.domain.entities.User;

@Service
public class IUserServiceImpl implements IUserService {

	
	@Autowired
	private IUserDao userDao;

	@Override
	public List<User> findAll() {
		return (List<User>) userDao.findAll();
	}

	@Override
	public void save(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	@Transactional(readOnly=true)
	public Optional<User> findOne(Long id) {
		return userDao.findById(id);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}
}
