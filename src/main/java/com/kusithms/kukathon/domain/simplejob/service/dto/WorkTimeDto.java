package com.kusithms.kukathon.domain.simplejob.service.dto;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.kusithms.kukathon.domain.simplejob.entity.WorkTime;

public class WorkTimeDto {

	private String week;
	@JsonFormat(pattern = "HH:mm")
	private LocalDateTime startTime;
	@JsonFormat(pattern = "HH:mm")
	private LocalDateTime endTime;

	public WorkTimeDto(WorkTime workTime) {
		this.week = workTime.getWeek();
		this.startTime = LocalDateTime.of(2023, 03, 26, workTime.getStartTime().toHoursPart(), workTime.getStartTime().toMinutesPart());
		this.endTime = LocalDateTime.of(2023, 03, 26, workTime.getEndTime().toHoursPart(), workTime.getEndTime().toMinutesPart());
	}

	public String getWeek() {
		return week;
	}

	public void setWeek(String week) {
		this.week = week;
	}

	public LocalDateTime getStartTime() {
		return startTime;
	}

	public void setStartTime(LocalDateTime startTime) {
		this.startTime = startTime;
	}

	public LocalDateTime getEndTime() {
		return endTime;
	}

	public void setEndTime(LocalDateTime endTime) {
		this.endTime = endTime;
	}
}
