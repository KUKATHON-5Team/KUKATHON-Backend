package com.kusithms.kukathon.domain.job.entity;

import java.time.Period;

import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
public class WorkPeriod {

	private Period workTime;
	@Enumerated(EnumType.STRING)
	private WorkPeriodType workPeriodType;

	@Builder
	public WorkPeriod(Period workTime) {
		this.workTime = workTime;
		this.workPeriodType = calculateWorkTimeType(workTime);
	}

	private WorkPeriodType calculateWorkTimeType(Period workTime) {
		if (workTime.getYears() >= 3) {
			return WorkPeriodType.MORETHAN3YEAR;
		} else if (workTime.getYears() >= 1) {
			return WorkPeriodType.MORETHAN1YEAR;
		} else if (workTime.getMonths() >= 6) {
			return WorkPeriodType.MORETHAN6MONTH;
		} else if (workTime.getMonths() >= 3) {
			return WorkPeriodType.MORETHAN3MONTH;
		} else if (workTime.getMonths() >= 1) {
			return WorkPeriodType.MORETHAN1MONTH;
		} else {
			return WorkPeriodType.MORETHAN1WEEK;
		}
	}

}
