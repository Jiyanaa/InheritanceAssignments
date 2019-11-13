package com.training.assignments.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.training.assignments.EmployeeManagement;
import com.training.assignments.Manager;
import com.training.assignments.MarkettingExclusive;
import com.training.assignments.exception.NullInputStringexception;

public class EmployeeManagementTest {

	@Test
	public void testToGetGrossSalaryOfManager(){
		EmployeeManagement manager = new Manager("Anagha",20000,500);
		double expected = manager.calculateGrossSalary();
		assertEquals(35300.0, expected,0.01);
	}
	
	@Test
	public void testToGetGrossSalaryOfMarkettingExclusive()  {
		EmployeeManagement me = new MarkettingExclusive("Aradhya",50000,500,5);
		double expected = me.calculateGrossSalary();
		assertEquals(77030.0, expected,0.01);
	}
	
	@Test
	public void testToGetNetSalaryOfMarkettingExclusive() {
		EmployeeManagement me = new MarkettingExclusive("Aradhya",50000,500,5);
		double expected = me.calculateNetSalary();
		assertEquals(70830, expected,0.01);
	}
	@Test
	public void testToGetNetSalaryOfManager() {
		EmployeeManagement manager = new Manager("Anagha",20000,500);
		double expected = manager.calculateNetSalary();
		assertEquals(32700.0, expected,0.01);
	}
	
	@Test
	public void getDetailsOfManager() {
		String expected = "employeeId=1\n" + 
				"employeeName=Pooja\n" + 
				"basicSalary=30000.0\n" + 
				"HRA=15000.0\n" + 
				"medical=200.0\n" + 
				"PF=3600.0\n" + 
				"PT=200.0\n" + 
				"netSalary=48600.0\n" + 
				"grossSalary=52400.0\n" +
				"petrolAllowance=2400.0\n" +
				"foodAllowance=3900.0\n" +
				"otherAllowance=900.0";
		
		EmployeeManagement manager = new Manager("Pooja",30000,200);
		String actual = EmployeeManagement.showDetails(manager);
		String result = EmployeeManagement.showDetails(manager);
		System.out.println(actual);
		assertEquals(expected, actual);
	}
	
	@Test
	public void getDetailsOfMarkettingExclusive() {
		String expected = "employeeId=1\n" + "employeeName=rehna\n" + "basicSalary=20000.0\n" +
				"HRA=10000.0\n" +
				"medical=200.0\n" +
				"PF=2400.0\n" +
				"PT=200.0\n" +
				"netSalary=29130.0\n" +
				"grossSalary=31730.0\n" +
				"kelometerTravelled=5\n" +
				"tourAllowance=25.0\n" +
				"telephoneAllowance=1500.0";
		
		EmployeeManagement me = new MarkettingExclusive("rehna",20000,200,5);
		String result = EmployeeManagement.showDetails(me);
		System.out.println(result);
		assertEquals(expected, result);
	}
	
	

}
