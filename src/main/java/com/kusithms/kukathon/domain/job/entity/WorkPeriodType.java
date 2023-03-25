package com.kusithms.kukathon.domain.job.entity;

import lombok.Getter;

@Getter
public enum WorkPeriodType {
	MORETHAN1WEEK("1주일 이상"),
	MORETHAN1MONTH("1달 이상"),
	MORETHAN3MONTH("3달 이상"),
	MORETHAN6MONTH("6달 이상"),
	MORETHAN1YEAR("1년 이상"),
	MORETHAN3YEAR("3년 이상");

	private String name;

	WorkPeriodType(String name) {
		this.name = name;
	}
}
