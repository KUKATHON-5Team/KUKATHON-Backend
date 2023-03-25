package com.kusithms.kukathon.domain.job.entity;

public enum Category {
	MART("마트/편의점"),
	SECURITY("경비/주차"),
	MAKER("소일거리"),
	MEDICAL("돌봄/의료"),
	CLEANER("청소"),
	SIMPLEWORK("단순노동"),
	ETC("기타");

	private String category;

	Category(String category) {
		this.category = category;
	}
}
