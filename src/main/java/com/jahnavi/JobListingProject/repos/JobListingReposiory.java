package com.jahnavi.JobListingProject.repos;



import org.springframework.data.jpa.repository.JpaRepository;

import com.jahnavi.JobListingProject.entities.JobPost;

public interface JobListingReposiory extends JpaRepository<JobPost, Integer> {

}
