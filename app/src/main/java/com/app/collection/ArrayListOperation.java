package com.app.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ArrayListOperation {
	
	public static void main(String[] args) throws CustomException {
		
		Scanner sc = new Scanner(System.in);
		int ch;
		String firstName=null;
		String lastName=null;
		int empId=0;
		
		Employee emp;
		List<Employee> empList = new ArrayList<Employee>();
		
		do {
			
			System.out.println("1.Add employee record");
			System.out.println("2.Remove employee record");
			System.out.println("3.Display All employee record");
			System.out.println("4.Search for employee record");
			System.out.println("5.Update employee record");
			System.out.println("0.Exit");
			
			System.out.println("enter which operation you want to perform");
			ch = sc.nextInt();
			
			switch (ch) {
			case 1:
			{
				try {
				System.out.println("enter first name of employee");
				firstName = sc.next();
				UserExceptions.validateFirstAndLastName(firstName);
				System.out.println("enter last name of employee");
				lastName =sc.next();
				UserExceptions.validateFirstAndLastName(lastName);
				System.out.println("enter id for employee");
				empId = sc.nextInt();
				}
				catch (Exception e) {
					System.out.println(e);
					break;
				}
				
				emp = new Employee(firstName, lastName, empId);
				empList.add(emp);
				break;	
			}
			case 2:
			{
				boolean found=true;
				System.out.println("enter empId to remove the record");
				empId = sc.nextInt();
				
				Iterator<Employee> itr = empList.iterator();
				
				while(itr.hasNext()) {
					if(itr.next().getEmpId()==empId) {
						itr.remove();
						System.out.println("Employee record successfully deleted....");
						found=true;
					}
				}
				if(!found) {
					System.out.println("EMployee record does not found... enter correct empId");
			}	
				break;
				}
				
				
			case 3:
				System.out.println(empList);
				break;
			
			case 4:
			{
				boolean found=false;
				System.out.println("enter employee empId to search");
				empId=sc.nextInt();
				
				for(Employee empobj:empList) {
					if(empobj.getEmpId()==empId) {
						System.out.println(empobj);
						found = true;
					}
				}
				if(!found) {
						System.out.println("EMployee record does not found... enter correct empId");
				}
				break;
			}
			case 5:
			{
				boolean found=false;
				System.out.println("enter employee empId to update");
				empId=sc.nextInt();
				
				for(Employee empobj:empList) {
					if(empobj.getEmpId()==empId) {
						System.out.println("enter firstName, LastName, and empId to update Employee record");
						firstName = sc.next();
						lastName = sc.next();
						empId = sc.nextInt();
						empobj.setEmpId(empId);
						empobj.setFirstName(firstName);
						empobj.setLastName(lastName);
						System.out.println("employee record updated");
						found=true;
					}
				}
				if(!found) {
					System.out.println("EMployee record does not found... enter correct empId");
				}
				System.out.println(empList);
				break;
			}
			default:
				break;
			}
		}while(ch!=0);
	}
}
