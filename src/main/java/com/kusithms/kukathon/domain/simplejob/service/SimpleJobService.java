package com.kusithms.kukathon.domain.simplejob.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kusithms.kukathon.domain.simplejob.entity.Dong;
import com.kusithms.kukathon.domain.simplejob.entity.SimpleJob;
import com.kusithms.kukathon.domain.simplejob.repository.SimpleJobQueryRepository;
import com.kusithms.kukathon.domain.simplejob.repository.SimpleJobRepository;
import com.kusithms.kukathon.domain.simplejob.service.dto.reqeust.SimpleJobSearchRequest;
import com.kusithms.kukathon.domain.simplejob.service.dto.response.SearchJobResponse;
import com.kusithms.kukathon.domain.simplejob.service.dto.SimpleJobDto;

import lombok.RequiredArgsConstructor;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class SimpleJobService {

	private final SimpleJobRepository simpleJobRepository;
	private final SimpleJobQueryRepository simpleJobQueryRepository;

	@PostConstruct
	@Transactional
	public void init() {
		// SimpleJob simpleJob = SimpleJob.builder()
		// 	.title("test")
		// 	.info("test")
		// 	.region(Region.builder()
		// 		.si(Si.서울특별시)
		// 		.gu(Gu.강남구)
		// 		.dong(Dong.개포동)
		// 		.detailAddress("1228-6")
		// 		.build())
		// 	.workTime(WorkTime.builder()
		// 		.weekList(List.of(Week.MONDAY, Week.SATURDAY, Week.SUNDAY))
		// 		.startTime(Duration.ofHours(9))
		// 		.endTime(Duration.ofHours(15))
		// 		.build())
		// 	.hourWage(10000)
		// 	.imageUrl("test")
		// 	.build();
		//
		// simpleJobRepository.save(simpleJob);
	}

	public SearchJobResponse searchJob(SimpleJobSearchRequest request){
		List<SimpleJob> simpleJobList = simpleJobQueryRepository.findBySearchCondition(Dong.valueOf(request.getRegion().getDong()),
			request.getCategories(), request.getWorkInHome(), request.getWorkPeriodType());

		List<SimpleJobDto> simpleJobDto = new ArrayList<>();

		for (SimpleJob simpleJob : simpleJobList) {
			simpleJobDto.add(SimpleJobDto.from(simpleJob));
		}
		return new SearchJobResponse(simpleJobDto);
	}
}
