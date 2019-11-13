package com.training.assignments;


public class EmployeeManagement {
	
	private int employeeId;
	private String employeeName;
	private double basicSalary;
	private double HRA;
	private double medical;
	private double PF;
	private double PT;
	private double netSalary;
	private double grossSalary;
	
	public EmployeeManagement() {
		this.employeeId = ++employeeId;
	}
	
	public EmployeeManagement(String employeeName, double basicSalary,double medical) {
		this();
		this.employeeName = employeeName;
		this.basicSalary = basicSalary;
		this.HRA = this.basicSalary *50/100 ;
		this.medical = medical;
		this.PF = this.basicSalary * 12/100;
		this.PT = 200.0;
		this.grossSalary = calculateGrossSalary();
		this.netSalary = calculateNetSalary();
	}

	
	
	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	
	public double getNetSalary() {
		return netSalary;
	}

	public void setNetSalary(double netSalary) {
		this.netSalary = netSalary;
	}

	public double getGrossSalary() {
		return grossSalary;
	}

	public void setGrossSalary(double grossSalary) {
		this.grossSalary = grossSalary;
	}

	
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", basicSalary=" + basicSalary
				+ ", HRA=" + HRA + ", medical=" + medical + ", PF=" + PF + ", PT=" + PT + ", netSalary=" + netSalary
				+ ", grossSalary=" + grossSalary + "]";
	}
	
	
	public double getHRA() {
		return HRA;
	}

	public void setHRA(double hRA) {
		HRA = hRA;
	}

	public double getMedical() {
		return medical;
	}

	public void setMedical(double medical) {
		this.medical = medical;
	}

	public double getPF() {
		return PF;
	}

	public void setPF(double pF) {
		PF = pF;
	}

	public double getPT() {
		return PT;
	}

	public void setPT(double pT) {
		PT = pT;
	}

	//calculate gross salary
	public double calculateGrossSalary() {
		this.grossSalary  = this.basicSalary + this.HRA +this.medical;
		return this.grossSalary;
	}
	
	
	//calculate net salary
	public double calculateNetSalary() {
		this.netSalary  = this.grossSalary-(this.PT + this.PF);
		return this.netSalary;
	}
	
	
	public String displayDetails() {
		String employeeDetails = "employeeId=" + employeeId + "\nemployeeName=" + employeeName + "\nbasicSalary=" + basicSalary
				+ "\nHRA=" + HRA + "\nmedical=" + medical + "\nPF=" + PF + "\nPT=" + PT + "\nnetSalary=" + netSalary
				+ "\ngrossSalary=" + grossSalary;	
		return employeeDetails;		
	}
	
	public static String showDetails(EmployeeManagement employee) {
		return employee.displayDetails();
	}
}
