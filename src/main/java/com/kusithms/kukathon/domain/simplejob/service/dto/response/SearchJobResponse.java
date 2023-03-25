package com.kusithms.kukathon.domain.simplejob.service.dto.response;

import java.util.List;

import com.kusithms.kukathon.domain.simplejob.service.dto.SimpleJobDto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SearchJobResponse {

	private int listCount;
	private List<SimpleJobDto> simpleJobList;


	public SearchJobResponse(List<SimpleJobDto> simpleJobList) {
		this.simpleJobList = simpleJobList;
		this.listCount = simpleJobList.size();
	}
}
