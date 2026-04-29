package com.shreyaJavaProj.Application.Automation.Repository;

import com.shreyaJavaProj.Application.Automation.entity.JobMatch;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JobMatchRepository extends JpaRepository<JobMatch, Long> {
    List<JobMatch> findByUserIdOrderByScoreDesc(Long userId);
}
