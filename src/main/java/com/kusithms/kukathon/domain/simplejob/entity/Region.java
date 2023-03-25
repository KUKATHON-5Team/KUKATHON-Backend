package com.kusithms.kukathon.domain.simplejob.entity;

import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
public class Region {

	@Enumerated(EnumType.STRING)
	private Si si;
	@Enumerated(EnumType.STRING)
	private Gu gu;
	@Enumerated(EnumType.STRING)
	private Dong dong;

	private String detailAddress;

	@Builder
	public Region(Si si, Gu gu, Dong dong, String detailAddress) {
		this.si = si;
		this.gu = gu;
		this.dong = dong;
		this.detailAddress = detailAddress;
	}

	public String toAllRegionSimpleInfo(){
		StringBuilder stringBuilder = new StringBuilder();
		return stringBuilder.append(si).append(" ")
			.append(gu).append(" ")
			.append(dong).toString();
	}

	public String toAllRegionInfo(){
		StringBuilder stringBuilder = new StringBuilder();
		return stringBuilder.append(si).append(" ")
			.append(gu).append(" ")
			.append(dong).append(" ")
			.append(detailAddress).toString();

	}
}
