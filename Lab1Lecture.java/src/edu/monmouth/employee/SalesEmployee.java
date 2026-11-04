package edu.monmouth.employee;

public class SalesEmployee implements Employee{
	
	private int commission;
	private int yearlyBase;
	
	public SalesEmployee(int yearlyBase) {
		this.yearlyBase = yearlyBase;
	}
	
	public void setCommission(int commission) {
		this.commission = commission;
	}
	
	public int getMonthlyPay() {
		return (this.yearlyBase / 12) + commission;
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
		
		SalesEmployee otherEmployee = (SalesEmployee) otherObject;
		return this.yearlyBase == otherEmployee.yearlyBase && this.commission == otherEmployee.commission;
		
	}
	
	@Override
	public String toString() {
		return "Commission: $" + this.commission + " | Yearly Base: $" + this.yearlyBase;
	}

}
