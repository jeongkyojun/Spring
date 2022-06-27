package com.user.kyojun.service;

import java.util.List;

import com.user.kyojun.dto.UserDto;
import com.user.kyojun.model.mapper.UserMapper;

public class userServiceImpl implements userService{

	UserMapper mapper;
	
	@Override
	public int insert(UserDto user) {
		// TODO Auto-generated method stub
		return mapper.insert(user);
	}

	@Override
	public int delete(String id) {
		// TODO Auto-generated method stub
		return mapper.delete(id);
	}

	@Override
	public UserDto select(String id) {
		// TODO Auto-generated method stub
		return mapper.select(id);
	}

	@Override
	public List<UserDto> selectAll() {
		// TODO Auto-generated method stub
		return mapper.selectAll();
	}
	
}
