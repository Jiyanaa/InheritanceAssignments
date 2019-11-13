package com.training.assignments;


import java.util.Date;


public class AcceptAndReturnDateUsingConstuctor {
	
private Date date;
	
	public AcceptAndReturnDateUsingConstuctor() {
	}
	
	public AcceptAndReturnDateUsingConstuctor(Date date) {
		this.date = date;
	}
	
	public Date getDate() {	
		return this.date;
	}
	
	
	public void setDate(Date date) {
		this.date = date;
	}
}
