package com.jahnavi.JobListingProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jahnavi.JobListingProject.entities.JobPost;
import com.jahnavi.JobListingProject.repos.JobListingReposiory;

@Controller
public class FrontEndController {
	
	@Autowired
	private JobListingReposiory repo;

	@RequestMapping("home")
	public String showHomePage() {
		return "home";
	}
	
	@RequestMapping("availableJobs")
	public String showJobsAvailable(ModelMap model) {
		
		List<JobPost> posts = repo.findAll();
		System.out.println(posts.get(0).getDesc());
		model.put("posts", posts);
		
		return "jobsAvailable";
	}
	
	@RequestMapping(value="hiresomeone", method = RequestMethod.GET )
	public String showHireSomeone(ModelMap model) {
		
		JobPost post = new JobPost();
		//JobPost post = new JobPost("developer",1,"require a software developer",devskils);
		model.addAttribute(post);
		return "hiresomeone";
	}
	
	@RequestMapping(value="hiresomeone", method = RequestMethod.POST )
	public String showHireSomeone(ModelMap model, JobPost post) {
	
		System.out.println("in here");
		repo.save(post);
		
		return "redirect:hiresomeone";
	}
}
