package com.example.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.ssm.mapper.UserMapper;
import com.example.ssm.pojo.entity.User;
import com.example.ssm.service.UserService;

public class UserServiceImpl implements UserService {
	//Spring注解开发的自动注入
	@Autowired
	private UserMapper userMapper;
	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}
	@Override
	public List<User> getAllUser() {
		return userMapper.getAllUser();
	}

}
