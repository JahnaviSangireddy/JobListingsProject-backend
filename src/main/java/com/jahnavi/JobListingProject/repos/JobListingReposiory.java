package com.jahnavi.JobListingProject.repos;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.jahnavi.JobListingProject.entities.JobPost;

public interface JobListingReposiory extends MongoRepository<JobPost, Integer> {

}
