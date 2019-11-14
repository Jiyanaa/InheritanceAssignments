package com.training.assignments;

import com.training.assignments.exception.NullInputStringexception;

/**
 * @author swayadav
 *
 */
public class Manager extends NewEmployee{
	
	/**
	 * properties of manager class
	 * petrolAllowance , foordAllowance, otherAllowance
	 */
	private double petrolAllowance;
	private double foodAllowance;
	private double otherAllowance;
	

	/**
	 * default constuctor
	 */
	public Manager() {
	}
	
	/**
	 * @param employeeName
	 * @param basicSalary
	 * @param medical
	 * @throws NullInputStringexception
	 */
	public Manager(String employeeName,double basicSalary,double medical) throws NullInputStringexception {
		super(employeeName,basicSalary,medical);
		this.petrolAllowance = basicSalary * 8/100;
		this.foodAllowance = basicSalary * 13/100;
		this.otherAllowance = basicSalary * 3 /100;
		calculateGrossSalary();
		calculateNetSalary();
	}

	public double getPetrolAllowance() {
		return petrolAllowance;
	}
	
	public void setPetrolAllowance(double petrolAllowance) {
		this.petrolAllowance = petrolAllowance;
	}
	
	public double getFoodAllowance() {
		return foodAllowance;
	}
	
	public void setFoodAllowance(double foodAllowance) {
		this.foodAllowance = foodAllowance;
	}
	
	public double getOtherAllowance() {
		return otherAllowance;
	}
	
	public void setOtherAllowance(double otherAllowance) {
		this.otherAllowance = otherAllowance;
	}
	
	@Override
	public String toString() {
		return "ManagerExclusive [petrolAllowance=" + petrolAllowance + ", foodAllowance=" + foodAllowance
				+ ", otherAllowance=" + otherAllowance + "]";
	}
	
	@Override
	public double calculateGrossSalary() {
		double grossSalary = super.calculateGrossSalary() + getFoodAllowance() + getOtherAllowance() + getPetrolAllowance();
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
		String employeeDetails = super.displayDetails() + "\npetrolAllowance=" + petrolAllowance + "\nfoodAllowance=" + foodAllowance
				+ "\notherAllowance=" + otherAllowance;	
		return employeeDetails;		
	}
	
}
