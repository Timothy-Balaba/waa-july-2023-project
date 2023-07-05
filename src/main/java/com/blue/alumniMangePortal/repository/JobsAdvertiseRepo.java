package com.blue.alumniMangePortal.repository;

import com.blue.alumniMangePortal.entity.JobsAdvertise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobsAdvertiseRepo extends JpaRepository<JobsAdvertise,Long> {

//    public List <JobsAdvertise> findFirst10ByOrderByPostedDateAsc();

//    public List<JobsAdvertiseRepo> getFirstTenJobAppliedAdverts();
    }
