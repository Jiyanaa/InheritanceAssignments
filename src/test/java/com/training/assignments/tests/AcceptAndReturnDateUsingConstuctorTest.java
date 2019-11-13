package com.training.assignments.tests;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

import com.training.assignments.AcceptAndReturnDateByCreatingObject;
import com.training.assignments.AcceptAndReturnDateUsingConstuctor;
import com.training.assignments.exception.NullInputStringexception;

public class AcceptAndReturnDateUsingConstuctorTest {

	@Test
	public void testToPrintDateUsingNoArgumentConstructor() throws ParseException{
		AcceptAndReturnDateUsingConstuctor object = new AcceptAndReturnDateUsingConstuctor();
		
		String dateInputPattern = "dd-MM-yyyy"; 
		SimpleDateFormat sdf = new SimpleDateFormat( dateInputPattern );
		
		Date date = sdf.parse("12-09-2019");
		object.setDate(date);
		Date result = object.getDate();
		System.out.println(date);
		assertEquals(date, result);
	}
	

	@Test
	public void testToPrintDateUsingParameterizedArgumentConstructor() throws ParseException {
		String dateInputPattern = "dd-MM-yyyy"; 
		SimpleDateFormat sdf = new SimpleDateFormat( dateInputPattern );
		
		Date date = sdf.parse("12-09-2019");
		
		AcceptAndReturnDateUsingConstuctor object = new AcceptAndReturnDateUsingConstuctor(date);
		Date result = object.getDate();
		System.out.println(result);
		assertEquals(date,result);
		
	}

}
