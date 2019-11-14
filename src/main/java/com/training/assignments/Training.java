package com.training.assignments;

/**
 * @author swayadav
 *
 */
public class Training {
	
	/**
	 * priveate properties of training class
	 * id,subject,fees
	 */
	private int id;
	private String subject;
	private double fees;
	
	/**
	 * generate automatic id 
	 */
	public Training() {
		this.id = ++id;
	}
	
	/**
	 * @param subject
	 * @param fees
	 */
	public Training(String subject, double fees) {
		this();
		this.subject = subject;
		this.fees = fees;
	}


	/**
	 * @return
	 * setter and getter method for properties(id, subject, fees)
	 */
	public int getId() {
		return id;
	}
	
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getSubject() {
		return subject;
	}
	
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public double getFees() {
		return fees;
	}
	
	public void setFees(double fees) {
		this.fees = fees;
	}

}
