package com.training.assignments;

import com.training.assignments.exception.NullInputStringexception;

/**
 * @author swayadav
 *
 */

public class MarkettingExclusive extends NewEmployee{
	
	/**
	 * data members/properties for marketting exclusive class
	 * kelometerTravelled,tourAllowance,telephoneAllowance
	 */
	private int kelometerTravelled;
	private double tourAllowance;
	private double telephoneAllowance;
	
	
	/**
	 * default constructor
	 */
	public MarkettingExclusive() {
	}
	
	
	
	/**
	 * @param employeeName
	 * @param basicSalary
	 * @param medical
	 * @param kelometerTravelled
	 * @throws NullInputStringexception
	 * It calls super constructor and initialized value to data members inside class
	 */
	public MarkettingExclusive(String employeeName,double basicSalary,double medical,int kelometerTravelled) throws NullInputStringexception {
		super(employeeName,basicSalary,medical);
		this.kelometerTravelled = kelometerTravelled;
		this.tourAllowance =this.kelometerTravelled *5;
		this.telephoneAllowance = 1500;
		calculateGrossSalary();
		calculateNetSalary();
	}
	
	public int getKelometerTravelled() {
		return kelometerTravelled;
	}

	public void setKelometerTravelled(int kelometerTravelled) {
		this.kelometerTravelled = kelometerTravelled;
	}



	public double getTourAllowance() {
		return tourAllowance;
	}
	
	public void setTourAllowance() {
		this.tourAllowance = this.kelometerTravelled * 5;
	}
	
	public double getTelephoneAllowance() {
		return telephoneAllowance;
	}
	
	public void setTelephoneAllowance(double telephoneAllowance) {
		this.telephoneAllowance = 1500;
	}

	@Override
	public String toString() {
		return "ManagerExclusive [kelometerTravelled=" + kelometerTravelled + ", tourAllowance=" + tourAllowance
				+ ", telephoneAllowance=" + telephoneAllowance + "]";
	}
	

	@Override
	public double calculateGrossSalary() {
		double grossSalary = super.calculateGrossSalary() + getKelometerTravelled() + getTourAllowance() + getTelephoneAllowance();
		super.setGrossSalary(grossSalary);
		return super.getGrossSalary();
	}
	
	@Override
	public double calculateNetSalary() {
		double netSalary = super.getGrossSalary() - (super.getPF() + super.getPT());
		super.setNetSalary(netSalary);
		return super.getNetSalary();
	}
	
	public String displayDetails() {
		String employeeDetails = super.displayDetails() + "\nkelometerTravelled="
				+ getKelometerTravelled() + "\ntourAllowance=" + getTourAllowance() + "\ntelephoneAllowance=" + getTelephoneAllowance();	
		return employeeDetails;		
	}
}
