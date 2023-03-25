package com.kusithms.kukathon.domain.job.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
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
	private int minimumAge;
	private int maxAge;

	private String detailAddress;

	private LocalDateTime recruitStartDate;
	private LocalDateTime recruitEndDate;

	private String phoneNumber;
	private long viewCount;

	@OneToOne(mappedBy = "job")
	private SimpleJob simpleJob;

	@Builder
	public Job(Category category, int recruitCount, Gender gender, int minimumAge, int maxAge, String detailAddress,
		LocalDateTime recruitStartDate, LocalDateTime recruitEndDate, String phoneNumber) {
		this.category = category;
		this.recruitCount = recruitCount;
		this.gender = gender;
		this.minimumAge = minimumAge;
		this.maxAge = maxAge;
		this.detailAddress = detailAddress;
		this.recruitStartDate = recruitStartDate;
		this.recruitEndDate = recruitEndDate;
		this.phoneNumber = phoneNumber;
		this.viewCount = 0;
	}
}
