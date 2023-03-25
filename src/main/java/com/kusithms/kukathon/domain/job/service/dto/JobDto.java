package com.kusithms.kukathon.domain.job.service.dto;

import com.kusithms.kukathon.domain.job.entity.*;
import com.kusithms.kukathon.domain.simplejob.entity.Region;
import com.kusithms.kukathon.domain.simplejob.entity.WorkTime;
import com.kusithms.kukathon.domain.simplejob.service.dto.WorkTimeDto;
import lombok.Builder;

public class JobDto {
    private String title;
    private Category category;

    private int hourWage;

    private WorkTimeDto workTimeDto;

    private WorkPeriodType workPeriodType;

    private int recruitCount;

    private Gender gender;

    private WorkAge workAge;

    private String detailAddress;

    @Builder
    public JobDto(String title, Category category, int hourWage, WorkTime workTime, WorkPeriodType workPeriodType, int recruitCount, Gender gender, WorkAge workAge, Region region) {
        this.title = title;
        this.category = category;
        this.hourWage = hourWage;
        this.workTimeDto = new WorkTimeDto(workTime);
        this.workPeriodType = workPeriodType;
        this.recruitCount = recruitCount;
        this.gender = gender;
        this.workAge = workAge;
        this.detailAddress = region.toAllRegionInfo();
    }

    public static JobDto from(Job job){
        return JobDto.builder()
                .title(job.getSimpleJob().getTitle())
                .category(job.getCategory())
                .hourWage(job.getSimpleJob().getHourWage())
                .workTime(job.getSimpleJob().getWorkTime())
                .workPeriodType(job.getWorkPeriod().getWorkPeriodType())
                .recruitCount(job.getRecruitCount())
                .gender(job.getGender())
                .workAge(job.getWorkAge())
                .region(job.getSimpleJob().getRegion())
                .build();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public int getHourWage() {
        return hourWage;
    }

    public void setHourWage(int hourWage) {
        this.hourWage = hourWage;
    }

    public WorkTimeDto getWorkTimeDto() {
        return workTimeDto;
    }

    public void setWorkTimeDto(WorkTimeDto workTimeDto) {
        this.workTimeDto = workTimeDto;
    }

    public WorkPeriodType getWorkPeriodType() {
        return workPeriodType;
    }

    public void setWorkPeriodType(WorkPeriodType workPeriodType) {
        this.workPeriodType = workPeriodType;
    }

    public int getRecruitCount() {
        return recruitCount;
    }

    public void setRecruitCount(int recruitCount) {
        this.recruitCount = recruitCount;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public WorkAge getWorkAge() {
        return workAge;
    }

    public void setWorkAge(WorkAge workAge) {
        this.workAge = workAge;
    }

    public String getDetailAddress() {
        return detailAddress;
    }

    public void setDetailAddress(String detailAddress) {
        this.detailAddress = detailAddress;
    }
}
