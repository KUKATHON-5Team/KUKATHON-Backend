package com.kusithms.kukathon.domain.user.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kusithms.kukathon.domain.user.service.UserService;
import com.kusithms.kukathon.domain.user.service.dto.TestUserDto;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class UserController {

	private final UserService userService;

	@GetMapping("/test")
	public TestUserDto test(){
		return userService.test();
	}


}
