package com.kusithms.kukathon.domain.job.entity;

import lombok.Getter;

@Getter
public enum Gender {
	MALE("남자"),
	FEMALE("여자"),
	ALL("성별무관");

	private String name;

	Gender(String name) {
		this.name = name;
	}
}
