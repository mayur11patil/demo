package com.app.collection;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
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
			System.out.println("6.Read record from text file");
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
				if(empList.size()!=0) {
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
				}
				else {
					System.out.println("Employee list is empty you cannot remove record....");
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
			case 6:
			{
				try {
					Scanner scanner;
					BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\mayur.patil\\Desktop\\employee.txt"));	
					String line=null;
					int index = 0;
					 while ((line = reader.readLine()) != null) {
						 emp = new Employee(firstName, lastName, empId);
						 scanner = new Scanner(line);
						 scanner.useDelimiter(",");
						 while (scanner.hasNext()) {
							 String data = scanner.next();
							 if(index == 0) {
								 emp.setFirstName(data);
							 }
							 else if(index==1) {
								 emp.setLastName(data);
							 }
							 else if(index==2) {
								 emp.setEmpId(Integer.parseInt(data));
							 }
							 index ++;
						}
						 index=0;
						 empList.add(emp);
					}
					 reader.close();
				}
				catch(FileNotFoundException fn) {
					System.out.println("file not found......."+fn.getMessage());
				}
				catch(Exception e) {
					System.out.println("file exception..."+e.getMessage());
				}
				
				break;
			}
			default:
				break;
			}
		} while(ch!=0);
	}
}
