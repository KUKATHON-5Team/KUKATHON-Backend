package com.kusithms.kukathon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class KukathonApplication {

	public static void main(String[] args) {
		SpringApplication.run(KukathonApplication.class, args);
	}

}
