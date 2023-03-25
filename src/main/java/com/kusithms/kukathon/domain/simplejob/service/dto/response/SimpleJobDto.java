package com.kusithms.kukathon.domain.simplejob.service.dto.response;

import com.kusithms.kukathon.domain.simplejob.entity.SimpleJob;
import com.kusithms.kukathon.domain.simplejob.entity.WorkTime;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SimpleJobDto {

	private Long id;
	private String title;
	private String info;
	private WorkTime workTime;
	private int hourWage;
	private String region;
	private String imageUrl;

	@Builder
	public SimpleJobDto(Long id, String title, String info, WorkTime workTime, int hourWage, String region,
		String imageUrl) {
		this.id = id;
		this.title = title;
		this.info = info;
		this.workTime = workTime;
		this.hourWage = hourWage;
		this.region = region;
		this.imageUrl = imageUrl;
	}

	public static SimpleJobDto from(SimpleJob simpleJob){
		return SimpleJobDto.builder()
			.id(simpleJob.getId())
			.title(simpleJob.getTitle())
			.info(simpleJob.getInfo())
			.workTime(simpleJob.getWorkTime())
			.hourWage(simpleJob.getHourWage())
			.region(simpleJob.getRegion().toAllRegionSimpleInfo())
			.imageUrl(simpleJob.getImageUrl())
			.build();
	}
}
