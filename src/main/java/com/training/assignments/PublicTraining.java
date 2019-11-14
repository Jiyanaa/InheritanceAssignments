package com.training.assignments;

/**
 * @author swayadav
 *
 */
public class PublicTraining extends Training{
	
	private int participants;

	/**
	 * @param subject
	 * @param fees
	 * @param participants
	 * super is used for call to super class(i.e. Training)class constructor 
	 */
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
	
	/**
	 * @return
	 * display order values
	 * (fees * participants)
	 */
	public double getOrderValue() {
		double result = super.getFees() * participants;
		return result;
	}
	
}
