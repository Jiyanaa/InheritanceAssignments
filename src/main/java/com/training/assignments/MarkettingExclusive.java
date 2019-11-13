package com.training.assignments;


public class MarkettingExclusive extends EmployeeManagement{
	private int kelometerTravelled;
	private double tourAllowance;
	private double telephoneAllowance;
	
	
	public MarkettingExclusive() {
	}
	
	
	
	public MarkettingExclusive(String employeeName,double basicSalary,double medical,int kelometerTravelled) {
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
