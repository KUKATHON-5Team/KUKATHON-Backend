package com.kusithms.kukathon.domain.job.controller;

import com.kusithms.kukathon.domain.job.service.JobService;
import com.kusithms.kukathon.domain.job.service.dto.JobDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class JobController {

    private final JobService jobService;

    @GetMapping("/job/{jobId}")
    public JobDto jobInfo(@PathVariable Long jobId){
        return jobService.findById(jobId);
    }

}
