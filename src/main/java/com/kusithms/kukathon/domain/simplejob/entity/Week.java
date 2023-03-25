package com.kusithms.kukathon.domain.simplejob.entity;

import java.util.List;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
public enum Week {
	MONDAY("월"),
	TUESDAY("화"),
	WEDNESDAY("수"),
	THURSDAY("목"),
	FRIDAY("금"),
	SATURDAY("토"),
	SUNDAY("일");

	private String week;

	Week(String week) {
		this.week = week;
	}

	public static String parseToString(List<Week> weekList) {
		StringBuilder stringBuilder = new StringBuilder();
		for(int i = 0; i<weekList.size(); i++) {
			stringBuilder.append(weekList.get(i).getWeek());
			if(i != weekList.size() - 1) {
				stringBuilder.append(",");
			}
		}
		return stringBuilder.toString();
	}
}
