package com.kusithms.kukathon.domain.simplejob.service.dto.response;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SearchJobResponse {

	private List<SimpleJobDto> simpleJobList;

	public SearchJobResponse(List<SimpleJobDto> simpleJobList) {
		this.simpleJobList = simpleJobList;
	}
}
