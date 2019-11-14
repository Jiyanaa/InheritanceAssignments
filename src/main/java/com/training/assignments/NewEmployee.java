package com.training.assignments;

import com.training.assignments.exception.NullInputStringexception;

/**
 * @author swayadav
 *
 */

public class NewEmployee {
	
	private int employeeId;
	private String employeeName;
	private double basicSalary;
	private double HRA;
	private double medical;
	private double PF;
	private double PT;
	private double netSalary;
	private double grossSalary;
	
	/**
	 * 0-arg constructor here we set employee Id
	 */
	public NewEmployee() {
		this.employeeId = ++employeeId;
	}
	
	/**
	 * @param employeeName
	 * @param basicSalary
	 * @param medical
	 * @throws NullInputStringexception
	 * parameterized constructor to initialize all value
	 */
	public NewEmployee(String employeeName, double basicSalary,double medical) throws NullInputStringexception {
		this();
		validateInputParameters(employeeName,basicSalary,medical);
			
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
	
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", basicSalary=" + basicSalary
				+ ", HRA=" + HRA + ", medical=" + medical + ", PF=" + PF + ", PT=" + PT + ", netSalary=" + netSalary
				+ ", grossSalary=" + grossSalary + "]";
	}
	
	


	/**
	 * @return gross salary
	 * calculate gross salary for employee
	 */
	public double calculateGrossSalary() {
		this.grossSalary  = this.basicSalary + this.HRA +this.medical;
		return this.grossSalary;
	}
	
	
	
	/**
	 * @return net salary
	 * calculate net salary
	 */
	public double calculateNetSalary() {
		this.netSalary  = this.grossSalary-(this.PT + this.PF);
		return this.netSalary;
	}
	
	
	/**
	 * @return String
	 * display employee details
	 */
	public String displayDetails() {
		String employeeDetails = "employeeId=" + employeeId + "\nemployeeName=" + employeeName + "\nbasicSalary=" + basicSalary
				+ "\nHRA=" + HRA + "\nmedical=" + medical + "\nPF=" + PF + "\nPT=" + PT + "\nnetSalary=" + netSalary
				+ "\ngrossSalary=" + grossSalary;	
		return employeeDetails;		
	}
	
	/**
	 * @param employee
	 * @return
	 */
	public static String showDetails(NewEmployee employee) {
		return employee.displayDetails();
	}
	
	/**
	 * @param employeeName
	 * @param basicSalary
	 * @param medical
	 * @throws NullInputStringexception
	 * validate input parameters otherwise throw exception
	 */
	public static void validateInputParameters(String employeeName, double basicSalary, double medical) throws NullInputStringexception {
		if(employeeName.isEmpty() || employeeName==null || employeeName.isBlank()) {
			throw new NullInputStringexception("Input value should not be null or blank");
		}
		if(basicSalary < 1 || medical <1) {
			throw new NullInputStringexception("Input valid salary amount");
		}	
	}
}
