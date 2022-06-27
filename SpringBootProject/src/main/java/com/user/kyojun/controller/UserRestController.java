package com.user.kyojun.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.kyojun.service.userService;

@RestController
@CrossOrigin("*")
@RequestMapping("/")
public class UserRestController {

	@Autowired
	private userService usvc;

	// 예외처리를 조정
	private ResponseEntity<?> exceptionHandling(Exception e) {
		e.printStackTrace();
		return new ResponseEntity<String>("Exception: " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
