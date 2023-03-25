package com.kusithms.kukathon.domain.simplejob.entity;

import java.util.List;

public enum Week {
	MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

	public static String parseToString(List<Week> weekList){
		StringBuilder stringBuilder = new StringBuilder();
		Week firstWeek = weekList.get(0);
		weekList.remove(0);
		stringBuilder.append(firstWeek);
		for (Week week : weekList) {
			stringBuilder.append(",").append(week.toString());
		}
		return stringBuilder.toString();
	}
}
