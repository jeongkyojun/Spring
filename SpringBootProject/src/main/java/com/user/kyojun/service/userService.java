package com.user.kyojun.service;

import java.util.List;

import com.user.kyojun.dto.UserDto;

public interface userService {
	public int insert(UserDto user);
	public int delete(String id);
	public UserDto select(String id);
	public List<UserDto> selectAll();
}
