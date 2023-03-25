package com.kusithms.kukathon.domain.user.service;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kusithms.kukathon.domain.user.entity.User;
import com.kusithms.kukathon.domain.user.repository.UserRepository;
import com.kusithms.kukathon.domain.user.service.dto.TestUserDto;

import lombok.RequiredArgsConstructor;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class UserService {

	private final PasswordEncoder passwordEncoder;
	private final UserRepository userRepository;
	//
	// @Transactional
	// @PostConstruct
	// public void init(){
	// 	User user = User.builder()
	// 		.username("test")
	// 		.password(passwordEncoder.encode("test"))
	// 		.email("test")
	// 		.build();
	//
	// 	userRepository.save(user);
	// }



	public TestUserDto test() {
		User user = userRepository.findByUsername("test")
			.orElse(User.builder().username("test").password("test").email("test").build());

		return TestUserDto.from(user);
	}
}
