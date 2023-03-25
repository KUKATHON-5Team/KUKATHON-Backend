package com.kusithms.kukathon.domain.simplejob.entity;

import java.time.Duration;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.kusithms.kukathon.common.BaseEntity;
import com.kusithms.kukathon.domain.job.entity.Job;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
public class SimpleJob extends BaseEntity {

	@Id@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "simple_job_id")
	private Long id;

	private String title;
	private String info;

	private String week;

	private Duration startTime;
	private Duration endTime;

	@Enumerated(EnumType.STRING)
	private Si si;

	@Enumerated(EnumType.STRING)
	private Gu gu;
	@Enumerated(EnumType.STRING)
	private Dong dong;

	private int hourWage;
	private String imageUrl;

	@OneToOne
	@JoinColumn(name = "job_id")
	private Job job;

	@Builder
	public SimpleJob(String title, String info, List<Week> week, Duration startTime, Duration endTime, Si si, Gu gu,
		Dong dong,
		int hourWage, String imageUrl, Job job) {
		this.title = title;
		this.info = info;
		this.week = Week.parseToString(week);
		this.startTime = startTime;
		this.endTime = endTime;
		this.si = si;
		this.gu = gu;
		this.dong = dong;
		this.hourWage = hourWage;
		this.imageUrl = imageUrl;
		this.job = job;
	}
}
