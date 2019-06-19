package com.app.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ArrayListOperation {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no");
		int ch;
		String firstName;
		String lastName;
		int empId;
		
		Employee emp;
		List<Employee> empList = new ArrayList<Employee>();
	
		do {
			
			System.out.println("1.Add employee record");
			System.out.println("2.Remove employee record");
			System.out.println("3.Display employee record");
			System.out.println("0.Exit");
			
			System.out.println("enter which operation you want to perform");
			ch = sc.nextInt();
			
			switch (ch) {
			case 1:
			{
				System.out.println("enter first name of employee");
				firstName = sc.next();
				System.out.println("enter last name of employee");
				lastName =sc.next();
				System.out.println("enter id for employee");
				empId = sc.nextInt();
				
				emp = new Employee(firstName, lastName, empId);
				empList.add(emp);
				break;	
			}
			case 2:
			{
				System.out.println("enter empId to remove the record");
				empId = sc.nextInt();
				
				Iterator<Employee> itr = empList.iterator();
				
				while(itr.hasNext()) {
					if(itr.next().getEmpId()==empId) {
						itr.remove();
						System.out.println("Employee record successfully deleted....");
					}
				}
				
				/*try {
				for(Employee empobj:empList) {
					if(empobj.getEmpId()==empId) {
						empList.remove(empobj);
						System.out.println("Employee record successfully deleted....");
					}
				}
				break;
				}catch(Exception e) {
					
				}*/
				
				break;
				}
				
				
			case 3:
				System.out.println(empList);
				break;
			
			default:
				break;
			}
		}while(ch!=0);
	}

}