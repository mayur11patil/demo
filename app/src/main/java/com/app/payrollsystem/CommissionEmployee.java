package com.app.payrollsystem;

public class CommissionEmployee extends Employee{

	private double grossSales;
	private double commissionRate;
	
	public CommissionEmployee(String firstName, String lastName, String empId, double sales, double rate) {
		super(firstName, lastName, empId);
		setGrossSales(sales);
		setCommissionRate(rate);
	}

	public double getGrossSales() {
		return grossSales;
	}

	public void setGrossSales(double sales) {
		this.grossSales = ( sales < 0.0 ) ? 0.0 : sales;
	}

	public double getCommissionRate() {
		return commissionRate;
	}

	public void setCommissionRate(double rate) {
		this.commissionRate = ( rate > 0.0 && rate < 1.0 ) ? rate : 0.0;
	}

	@Override
	public double earnings() {
		return getCommissionRate() * getGrossSales();
	}
	
	public String toString()
	{
		return String.format( "%s: %s\n%s: $%,.2f; %s: %.2f",
				"commission employee", super.toString(),
				"gross sales", getGrossSales(),
				"commission rate", getCommissionRate() );
	}
}
