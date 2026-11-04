package edu.monmouth.employee;

public class SalaryEmployee implements Employee {
	
	private int yearlySalary;
	
	public SalaryEmployee(int yearlySalary) {
		this.yearlySalary = yearlySalary;
	}
	
	public int getMonthlyPay() {
		return this.yearlySalary / 12;
	}
	
	@Override
	public boolean equals(Object otherObject) {
		
		if (otherObject == null) {
			return false;
		}
		
		if (this.getClass() != otherObject.getClass()) {
			return false;
		}
		
		if (this == otherObject) {
			return true;
		}
		
		SalaryEmployee otherEmployee = (SalaryEmployee) otherObject;
		return this.yearlySalary == otherEmployee.yearlySalary;
		
	}
	
	@Override
	public String toString() {
		return "Yearly Salary: $" + this.yearlySalary;
	}

}
