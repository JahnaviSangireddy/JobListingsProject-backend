package com.jahnavi.JobListingProject.entities;

import java.util.Arrays;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "JobListings")
public class JobPost {

	//private int id;
	private String profile;
	private int exp;
	private String desc;
	private String techs[];
	
	public JobPost() {
		super();
	}
	
	/*
	 * public int getId() { return id; } public void setId(int id) { this.id = id; }
	 */
	public String getProfile() {
		return profile;
	}
	public void setProfile(String profile) {
		this.profile = profile;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String[] getTechs() {
		return techs;
	}
	public void setTechs(String[] techs) {
		this.techs = techs;
	}
	@Override
	public String toString() {
		return "JobPost [id=" + " " + ", profile=" + profile + ", exp=" + exp + ", desc=" + desc + ", techs="
				+ Arrays.toString(techs) + "]";
	}
}
