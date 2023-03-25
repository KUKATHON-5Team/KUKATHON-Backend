package com.kusithms.kukathon.domain.job.service;

import com.kusithms.kukathon.domain.job.entity.Job;
import com.kusithms.kukathon.domain.job.repository.JobRepository;
import com.kusithms.kukathon.domain.job.service.dto.JobDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class JobService {

    private final JobRepository jobRepository;

    public JobDto findById(Long jobId){
        Job job = jobRepository.findById(jobId)
                .orElseThrow(() -> new IllegalArgumentException("Job not found"));
        return JobDto.from(job);
    }

}
