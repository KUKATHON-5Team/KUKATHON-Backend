package com.kusithms.kukathon.domain.simplejob.service.dto;

import java.time.Duration;
import java.time.LocalDateTime;

import com.kusithms.kukathon.domain.simplejob.entity.SimpleJob;
import com.kusithms.kukathon.domain.simplejob.entity.WorkTime;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SimpleJobDto {

	private Long simpleJobId;
	private Long jobId;
	private String title;
	private String info;
	private WorkTimeDto workTime;
	private int hourWage;
	private String region;
	private String imageUrl;
	private int uploadDateTime;

	@Builder
	public SimpleJobDto(Long simpleJobId,Long jobId, String title, String info, int hourWage, String region, WorkTime workTime,
		String imageUrl, int uploadDate){
		this.simpleJobId = simpleJobId;
		this.jobId = jobId;
		this.title = title;
		this.info = info;
		this.hourWage = hourWage;
		this.region = region;
		this.imageUrl = imageUrl;
		this.workTime = new WorkTimeDto(workTime);
		this.uploadDateTime = uploadDate;
	}

	public static SimpleJobDto from(SimpleJob simpleJob){
		return SimpleJobDto.builder()
			.simpleJobId(simpleJob.getId())
			.jobId(simpleJob.getJob().getId())
			.title(simpleJob.getTitle())
			.info(simpleJob.getInfo())
			.workTime(simpleJob.getWorkTime())
			.hourWage(simpleJob.getHourWage())
			.region(simpleJob.getRegion().toAllRegionSimpleInfo())
			.imageUrl(simpleJob.getImageUrl())
			.uploadDate(Duration.between(simpleJob.getCreatedAt(), LocalDateTime.now()).toHoursPart())
			.build();
	}
}
