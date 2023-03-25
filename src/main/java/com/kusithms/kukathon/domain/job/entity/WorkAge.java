package com.kusithms.kukathon.domain.job.entity;

import javax.persistence.Embeddable;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
public class WorkAge {
	private int minimumAge;
	private int maxAge;
}
