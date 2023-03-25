package com.kusithms.kukathon.domain.simplejob.repository;

import static com.kusithms.kukathon.domain.simplejob.entity.QSimpleJob.*;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.kusithms.kukathon.domain.job.entity.Category;
import com.kusithms.kukathon.domain.job.entity.WorkPeriodType;
import com.kusithms.kukathon.domain.simplejob.entity.Dong;
import com.kusithms.kukathon.domain.simplejob.entity.SimpleJob;
import com.querydsl.core.BooleanBuilder;
import com.querydsl.jpa.impl.JPAQueryFactory;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class SimpleJobQueryRepositoryImpl implements SimpleJobQueryRepository{

	private final JPAQueryFactory jpaQueryFactory;

	public List<SimpleJob> findBySearchCondition(Dong dong, List<Category> categories, boolean workInHome, WorkPeriodType workPeriodType){
		List<SimpleJob> simpleJobList = jpaQueryFactory
			.selectFrom(simpleJob)
			.where(
				eqDong(dong),
				eqCategories(categories),
				eqWorkInHome(workInHome),
				eqWorkPeriodType(workPeriodType))
			.fetch();

		return simpleJobList;
	}

	private BooleanBuilder eqDong(Dong dong){
		BooleanBuilder booleanBuilder = new BooleanBuilder();
		return booleanBuilder.or(simpleJob.region.dong.eq(dong));
	}

	private BooleanBuilder eqCategories(List<Category> categories){
		BooleanBuilder booleanBuilder = new BooleanBuilder();
		for (Category category : categories) {
			booleanBuilder.or(simpleJob.job.category.eq(category));
		}
		return booleanBuilder;
	}

	private BooleanBuilder eqWorkInHome(boolean workInHome){
		BooleanBuilder booleanBuilder = new BooleanBuilder();
		return booleanBuilder.or(simpleJob.workInHome.eq(workInHome));
	}

	private BooleanBuilder eqWorkPeriodType(WorkPeriodType workPeriodType){
		BooleanBuilder booleanBuilder = new BooleanBuilder();
		booleanBuilder.or(simpleJob.job.workPeriod.workPeriodType.eq(workPeriodType));
		return booleanBuilder;
	}
}
