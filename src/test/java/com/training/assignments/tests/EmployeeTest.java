package com.training.assignments.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.training.assignments.Employee;
import com.training.assignments.exception.NullInputStringexception;

public class EmployeeTest {

	@Test
	public void testForShowEmployeeDetailsWithValidInputUsingParameterizedConstructor() {
		Employee employee = new Employee(101,"Anagha",50000.0,500.0);
		String expected = "Employee [employeeId=101, employeeName=Anagha, basicSalary=50000.0, HRA=25000.0, medical=500.0, PF=6000.0, PT=200.0, netSalary=69300.0, grossSalary=75500.0]";
		System.out.println(employee.toString());
		assertEquals(expected,employee.toString());
	}

	@Test
	public void testCalculateNetSalary(){
		Employee employee = new Employee(101,"Anagha",50000.0,500.0);
		double netSalary = employee.calculateNetSalary();
		assertEquals(69300.0, netSalary,0.01);
	}
	
	@Test
	public void testCalculateGrossSalary() {
		Employee employee = new Employee(101,"Anagha",50000.0,500.0);
		double netSalary = employee.calculateGrossSalary();
		assertEquals(75500.0, netSalary,0.01);
	}
	
	
}
