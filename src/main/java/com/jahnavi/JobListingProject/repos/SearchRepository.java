package com.jahnavi.JobListingProject.repos;

import java.util.List;

import com.jahnavi.JobListingProject.entities.JobPost;

public interface SearchRepository {

	public List<JobPost> findByText(String text);
}
