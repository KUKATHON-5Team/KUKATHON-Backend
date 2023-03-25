package com.kusithms.kukathon.domain.simplejob.repository;

import java.util.List;

import com.kusithms.kukathon.domain.job.entity.Category;
import com.kusithms.kukathon.domain.job.entity.WorkPeriodType;
import com.kusithms.kukathon.domain.simplejob.entity.Dong;
import com.kusithms.kukathon.domain.simplejob.entity.SimpleJob;

public interface SimpleJobQueryRepository {

	List<SimpleJob> findBySearchCondition(Dong dong, List<Category> categories, boolean workInHome, WorkPeriodType workPeriodType);
}
