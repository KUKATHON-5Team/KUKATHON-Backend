package com.kusithms.kukathon.domain.job.entity;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.kusithms.kukathon.common.BaseEntity;
import com.kusithms.kukathon.domain.simplejob.entity.SimpleJob;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
public class Job extends BaseEntity {

	@Id@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "job_id")
	private Long id;

	@Enumerated(EnumType.STRING)
	private Category category;

	private int recruitCount;

	@Enumerated(EnumType.STRING)
	private Gender gender;

	@Embedded
	private WorkAge workAge;
	@Embedded
	private RecruitTime recruitTime;
	@Embedded
	private WorkPeriod workPeriod;

	private PhoneNumber phoneNumber;

	private long viewCount;


	@OneToOne(mappedBy = "job")
	private SimpleJob simpleJob;

	@Builder
	public Job(Category category, int recruitCount, Gender gender, WorkAge workAge, RecruitTime recruitTime,
		PhoneNumber phoneNumber, long viewCount, SimpleJob simpleJob, WorkPeriod workPeriod) {
		this.category = category;
		this.recruitCount = recruitCount;
		this.gender = gender;
		this.workAge = workAge;
		this.recruitTime = recruitTime;
		this.phoneNumber = phoneNumber;
		this.viewCount = viewCount;
		this.simpleJob = simpleJob;
		this.workPeriod  =workPeriod;
	}
}
