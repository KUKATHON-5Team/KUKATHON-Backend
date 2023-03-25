package com.kusithms.kukathon.domain.simplejob.entity;

import java.time.Duration;
import java.util.List;

import javax.persistence.Embeddable;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
public class WorkTime {

	private String week;
	private Duration startTime;
	private Duration endTime;

	@Builder
	public WorkTime(List<Week> weekList, Duration startTime, Duration endTime) {
		this.week = Week.parseToString(weekList);
		this.startTime = startTime;
		this.endTime = endTime;
	}
}
