package com.training.assignments;

public class CorporateTraining extends Training{
	
	private int days;
	
	public CorporateTraining(String subject, double fees,int days) {
		super(subject,fees);
		this.days = days;
	}
	
	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}

	public double getOrderValue() {
		double result = super.getFees() * days;
		return result;	
	}


}
