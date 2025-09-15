package com.cloudshare.dto;


public class UserCreditsDTO {

    private Integer credits;
    private String plan;
    
	public UserCreditsDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserCreditsDTO(Integer credits, String plan) {
		super();
		this.credits = credits;
		this.plan = plan;
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
