package com.training.assignments.tests;

import static org.junit.Assert.assertEquals;


import org.junit.Test;

import com.training.assignments.CorporateTraining;
import com.training.assignments.PublicTraining;
import com.training.assignments.Training;

public class TrainingTest {
	
	@Test
	public void testForGettingTrainingChargesOfPublicTraining() {
		Training training;
			training = new PublicTraining("Java",5000,50);
			double result = ((PublicTraining) training).getOrderValue();
			System.out.println(result);
			assertEquals(250000.0, result,0.01);
		
	}

	
	@Test
	public void testForGettingTrainingChargesOfCorporateTraining() {
		Training training;
			training = new CorporateTraining("Big Data",35000,4);
			double result = ((CorporateTraining) training).getOrderValue();
			System.out.println(result);
			assertEquals(140000.0, result,0.01);
		
	}

}
