package com.jahnavi.JobListingProject.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jahnavi.JobListingProject.entities.JobPost;
import com.jahnavi.JobListingProject.repos.JobListingReposiory;
import com.jahnavi.JobListingProject.repos.SearchRepository;

@RestController
public class JobListingsController {
	
	private JobListingReposiory repo;
	private SearchRepository searchRepo;
	
	public JobListingsController(JobListingReposiory repo, SearchRepository searchRepo) {
		super();
		this.repo = repo;
		this.searchRepo = searchRepo;
	}
	
	@GetMapping("/posts")
	public List<JobPost> retrieveAllPosts() {
		return repo.findAll();
	}
	
	@PostMapping("/post")
	public JobPost AddJobPost(@RequestBody JobPost post) {
		return repo.save(post);
	}
	
	@GetMapping("/search/{text}")
	public List<JobPost> retriveBasedOnText(@PathVariable String text){
		return searchRepo.findByText(text);
	}
}
