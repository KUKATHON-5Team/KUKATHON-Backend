package com.kusithms.kukathon.domain.job.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kusithms.kukathon.domain.job.entity.Job;

public interface JobRepository extends JpaRepository<Job, Long> {
}
