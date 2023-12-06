package com.jahnavi.JobListingProject.entities;

import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class JobPost {

	@Id
	@GeneratedValue
	private int id;
	@Column(name = "jobName")
	private String profile;
	private int exp;
	private String desc;
	private String techs[];
	
	public JobPost() {
		super();
	}
	
	
	public JobPost(int id, String profile, int exp, String desc, String[] techs) {
		super();
		this.profile = profile;
		this.exp = exp;
		this.desc = desc;
		this.techs = techs;
	}

	public int getId() { 
		return id; 
	} 
	public void setId(int id) { 
		this.id = id; 
	}
	 
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
