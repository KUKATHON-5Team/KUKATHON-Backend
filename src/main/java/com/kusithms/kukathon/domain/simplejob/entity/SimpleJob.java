package com.kusithms.kukathon.domain.simplejob.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.kusithms.kukathon.common.BaseEntity;
import com.kusithms.kukathon.domain.job.entity.Job;

import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
public class SimpleJob extends BaseEntity {

	@Id@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "simple_job_id")
	private Long id;

	private String title;
	private String info;

	@Embedded
	private WorkTime workTime;

	@Embedded
	private Region region;

	private int hourWage;
	private String imageUrl;
	private boolean workInHome;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "job_id")
	private Job job;

	@Builder
	public SimpleJob(String title, String info, WorkTime workTime, Region region,
		int hourWage, String imageUrl, Job job, boolean workInHome) {
		this.title = title;
		this.info = info;
		this.workTime = workTime;
		this.region= region;
		this.hourWage = hourWage;
		this.imageUrl = imageUrl;
		this.job = job;
		this.workInHome = workInHome;
	}

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getInfo() {
		return info;
	}

	public WorkTime getWorkTime() {
		return workTime;
	}

	public Region getRegion() {
		return region;
	}

	public int getHourWage() {
		return hourWage;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public boolean getWorkInHome() {
		return workInHome;
	}

	public Job getJob() {
		return job;
	}
}
