package com.kusithms.kukathon.domain.simplejob.service.dto.reqeust;

import java.util.List;

import com.kusithms.kukathon.domain.job.entity.Category;
import com.kusithms.kukathon.domain.job.entity.WorkPeriodType;
import com.kusithms.kukathon.domain.simplejob.service.dto.RegionDto;

public class SimpleJobSearchRequest {

	private RegionDto region;
	private List<Category> categories;
	private boolean workInHome;
	private WorkPeriodType workPeriodType;

	public SimpleJobSearchRequest(RegionDto region, List<Category> categories, boolean workInHome,
		WorkPeriodType workPeriodType) {
		this.region = region;
		this.categories = categories;
		this.workInHome = workInHome;
		this.workPeriodType = workPeriodType;
	}

	public RegionDto getRegion() {
		return region;
	}

	public void setRegion(RegionDto region) {
		this.region = region;
	}

	public List<Category> getCategories() {
		return categories;
	}

	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}

	public boolean getWorkInHome() {
		return workInHome;
	}

	public void setWorkInHome(boolean workInHome) {
		this.workInHome = workInHome;
	}

	public WorkPeriodType getWorkPeriodType() {
		return workPeriodType;
	}

	public void setWorkPeriodType(WorkPeriodType workPeriodType) {
		this.workPeriodType = workPeriodType;
	}

	@Override
	public String toString() {
		return "SimpleJobSearchRequest{" +
			"region=" + region +
			", categories=" + categories +
			", workInHome=" + workInHome +
			", workPeriodType=" + workPeriodType +
			'}';
	}
}
