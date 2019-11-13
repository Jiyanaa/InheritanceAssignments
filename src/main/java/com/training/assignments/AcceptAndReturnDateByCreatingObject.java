package com.training.assignments;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class AcceptAndReturnDateByCreatingObject {
	
	private Date date;
	
	public AcceptAndReturnDateByCreatingObject() {
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
