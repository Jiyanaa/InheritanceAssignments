package com.training.assignments.tests;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

import org.junit.Test;

import com.training.assignments.AcceptAndReturnDateByCreatingObject;

public class AcceptAndReturnDateByCreatingObjectTest {

	@Test
	public void testToSetAndGetDate() throws ParseException {
		AcceptAndReturnDateByCreatingObject object = new AcceptAndReturnDateByCreatingObject();
		String dateInputPattern = "dd-MM-yyyy"; //here the pattern of input date is (day,month,year-ex:09,12,1200)

		//simpleDateFormat is used to format string in particular date format
		SimpleDateFormat sdf = new SimpleDateFormat( dateInputPattern );
		
		//parse method is used to parse string from starting index to the lase index
		Date date = sdf.parse("12-09-2019");
		object.setDate(date);
		Date result = object.getDate();
		System.out.println(date);
		assertEquals(date, result);
	}

}
