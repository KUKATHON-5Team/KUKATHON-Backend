package com.kusithms.kukathon.domain.job.entity;

import javax.persistence.Embeddable;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
public class PhoneNumber {

	private String phoneNumber;

	public PhoneNumber(String phoneNumber){
		this.phoneNumber = phoneNumber;
	}
}
