package com.app.payrollsystem;

public class HourlyEmployee extends Employee {

	private double wage;
	private double hours;
	
	
	public HourlyEmployee(String firstName, String lastName, String empId, double wage, double hours) {
		super(firstName, lastName, empId);
		setWage(wage);
		setHours(hours);
	}
	public double getWage() {
		return wage;
	}
	public void setWage(double hourlyWage) {
		this.wage = ( hourlyWage < 0.0 ) ? 0.0 : hourlyWage;
	}
	public double getHours() {
		return hours;
	}
	public void setHours(double hours) {
		this.hours = hours;
	}
	
	@Override
	public double earnings() {
		if ( getHours() <= 40 ) // no overtime
			          return getWage() * getHours();
			        else
			           return 40 * getWage() + ( getHours() - 40 ) * getWage() * 1.5;  //overtime
	}
	
	public String toString()
	{
		return String.format( "hourly employee: %s\n%s: $%,.2f; %s: %,.2f",
				super.toString(), "hourly wage", getWage(),
				"hours worked", getHours() );
	}
	
	
}
