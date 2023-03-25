package com.kusithms.kukathon.domain.simplejob.service.dto;

import com.kusithms.kukathon.domain.simplejob.entity.SimpleJob;
import com.kusithms.kukathon.domain.simplejob.entity.WorkTime;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SimpleJobDto {

	private Long jobId;
	private String title;
	private String info;
	private WorkTimeDto workTime;
	private int hourWage;
	private String region;
	private String imageUrl;

	@Builder
	public SimpleJobDto(Long id, String title, String info, int hourWage, String region, WorkTime workTime,
		String imageUrl) {
		this.jobId = id;
		this.title = title;
		this.info = info;
		this.hourWage = hourWage;
		this.region = region;
		this.imageUrl = imageUrl;
		this.workTime = new WorkTimeDto(workTime);
	}

	public static SimpleJobDto from(SimpleJob simpleJob){
		return SimpleJobDto.builder()
			.id(simpleJob.getJob().getId())
			.title(simpleJob.getTitle())
			.info(simpleJob.getInfo())
			.workTime(simpleJob.getWorkTime())
			.hourWage(simpleJob.getHourWage())
			.region(simpleJob.getRegion().toAllRegionSimpleInfo())
			.imageUrl(simpleJob.getImageUrl())
			.build();
	}
}
