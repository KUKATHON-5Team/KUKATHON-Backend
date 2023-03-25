package com.kusithms.kukathon.domain.simplejob.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kusithms.kukathon.domain.simplejob.entity.SimpleJob;

public interface SimpleJobRepository extends JpaRepository<SimpleJob, Long> {
}
