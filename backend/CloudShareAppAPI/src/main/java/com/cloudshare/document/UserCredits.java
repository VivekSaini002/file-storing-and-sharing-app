package com.cloudshare.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "user_credits")
public class UserCredits {
    @Id
    private String id;
    private String clerkId;
    private Integer credits;
    private String plan; //BASIC, PREMIUM, ULTIMATE
    
	public UserCredits() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserCredits(String id, String clerkId, Integer credits, String plan) {
		super();
		this.id = id;
		this.clerkId = clerkId;
		this.credits = credits;
		this.plan = plan;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getClerkId() {
		return clerkId;
	}

	public void setClerkId(String clerkId) {
		this.clerkId = clerkId;
	}

	public Integer getCredits() {
		return credits;
	}

	public void setCredits(Integer credits) {
		this.credits = credits;
	}

	public String getPlan() {
		return plan;
	}

	public void setPlan(String plan) {
		this.plan = plan;
	}
    
    
}
