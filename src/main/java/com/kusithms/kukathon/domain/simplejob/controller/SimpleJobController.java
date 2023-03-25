package com.kusithms.kukathon.domain.simplejob.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kusithms.kukathon.domain.job.entity.Category;
import com.kusithms.kukathon.domain.job.entity.WorkPeriodType;
import com.kusithms.kukathon.domain.simplejob.service.SimpleJobService;
import com.kusithms.kukathon.domain.simplejob.service.dto.RegionDto;
import com.kusithms.kukathon.domain.simplejob.service.dto.reqeust.SimpleJobSearchRequest;
import com.kusithms.kukathon.domain.simplejob.service.dto.response.SearchJobResponse;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequiredArgsConstructor
public class SimpleJobController {

	private final SimpleJobService simpleJobService;

	@PostMapping("/job")
	public SearchJobResponse searchJob(@RequestBody SimpleJobSearchRequest request){
		log.info(String.valueOf(request));
		return simpleJobService.searchJob(request);
	}

	@GetMapping("/testSimpleJob")
	public SimpleJobSearchRequest searchRequest(){
		return new SimpleJobSearchRequest(new RegionDto("서울특별시", "가평군", "간석1동"), List.of(Category.BUILDER), true, WorkPeriodType.MORETHAN3YEAR);
	}

}
