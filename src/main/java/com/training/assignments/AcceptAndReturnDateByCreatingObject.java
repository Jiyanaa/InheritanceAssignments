package com.training.assignments;

import java.util.Date;

public class AcceptAndReturnDateByCreatingObject {
	
	private Date date;
	
	public AcceptAndReturnDateByCreatingObject() {
		
		super();
	}
	
	public AcceptAndReturnDateByCreatingObject(Date date) {
		this.date = date;
	}
	
	public Date getDate() {	
		return this.date;
	}
	
	
	public void setDate(Date date) {
		this.date = date;
	}
		
}
