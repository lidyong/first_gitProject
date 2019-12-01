package com.join.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.join.dao.UserDao;
import com.join.entity.User;

@RestController
public class UserController {
	@Autowired
	private UserDao userDao;
	
	@RequestMapping("/addUser")
	public void addUser(@RequestBody User user) {
		userDao.save(user);
	}
	
	@RequestMapping("/getUserByid")
	public Optional<User> getUserByid(String id) {
		return userDao.findById(id);
	}
}
