package com.training.assignments;

public class PublicTraining extends Training{
	
	private int participants;

	public PublicTraining(String subject, double fees,int participants) {
		super(subject,fees);
		this.participants = participants;
	}
	
	public int getParticipants() {
		return participants;
	}

	public void setParticipants(int participants) {
		this.participants = participants;
	}	
	
	public double getOrderValue() {
		double result = super.getFees() * participants;
		return result;
	}
	
}
