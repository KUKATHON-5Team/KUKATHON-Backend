package com.kusithms.kukathon.domain.user.service.dto;

import com.kusithms.kukathon.domain.user.entity.User;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TestUserDto {

	private String username;
	private String password;

	@Builder
	public TestUserDto(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public static TestUserDto from(User user){
		return TestUserDto.builder()
			.username(user.getUsername())
			.password(user.getPassword())
			.build();
	}

}
