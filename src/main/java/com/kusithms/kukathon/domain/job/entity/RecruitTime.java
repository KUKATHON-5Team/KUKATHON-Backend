package com.kusithms.kukathon.domain.job.entity;

import java.time.LocalDateTime;

import javax.persistence.Embeddable;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
public class RecruitTime {

	private LocalDateTime recruitStartDate;
	private LocalDateTime recruitEndDate;
}
