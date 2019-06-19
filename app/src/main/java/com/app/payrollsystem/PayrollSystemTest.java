package com.app.payrollsystem;

public class PayrollSystemTest {

	public static void main(String[] args) {
		SalariedEmployee salempobj = new SalariedEmployee("Mayur", "Patil", "788", 30000);
		HourlyEmployee hoursempobj = new HourlyEmployee("rk", "kk", "777", 1000, 20);
		CommissionEmployee commempobj = new CommissionEmployee("Nikhil", "Gurav", "786", 50000, 0.5);
				
		System.out.println("Employee Payroll : ");
		System.out.println("Employee :" + salempobj +"\nEarned :\u20B9"+ salempobj.earnings());
		
		System.out.println("Employee :" + hoursempobj +"\nEarned :\u20B9"+ hoursempobj.earnings());
		
		System.out.println("Employee :" + commempobj +"\nEarned :\u20B9"+ commempobj.earnings());
	}
}
