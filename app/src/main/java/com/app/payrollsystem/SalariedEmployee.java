package com.app.payrollsystem;

public class SalariedEmployee extends Employee {

	private double weeklySalary;

	public SalariedEmployee(String firstName, String lastName, String empId, double salary) {
		super(firstName, lastName, empId);
		setWeeklySalary(salary);
	}

	public double getWeeklySalary() {
		return weeklySalary;
	}

	public void setWeeklySalary(double salary) {
		this.weeklySalary = salary < 0.0 ? 0.0 : salary;
	}

	@Override
	public double earnings() {
		return getWeeklySalary();
	}

	@Override
	public String toString()
	{
		return String.format( "salaried employee: %s\n%s: \u20B9%,.2f",
				super.toString(), "weekly salary", getWeeklySalary() );
	}
	
}
