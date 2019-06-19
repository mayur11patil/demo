package com.app.sorting;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class App {

	public static void main(String[] args) {
		
		List<Laptops> list = new ArrayList<Laptops>();
		list.add(new Laptops("dell", 40000, 8));
		list.add(new Laptops("apple", 100000, 10));
		list.add(new Laptops("hp", 50000, 6));
		list.add(new Laptops("acer", 30000, 5));
		
		Collections.sort(list);
		
		for(Laptops l:list) {
			System.out.println(l);
		}
		
		Comparator<Employee> comp = new Comparator<Employee>() {

			public int compare(Employee o1, Employee o2) {
			
				if(o1.getId()>o2.getId()) {
					return -1;
				}
				else
					return 1;
			}
		};
		
		List<Employee> emplist = new ArrayList<Employee>();
		
		
		emplist.add(new Employee("mayur", "atmecs", 788));
		emplist.add(new Employee("mayur1", "atmecs1", 400));
		emplist.add(new Employee("mayur2", "atmecs2", 800));
		emplist.add(new Employee("mayur3", "atmecs3", 200));
		
		System.out.println("Sorting Using Comparable interface Custom ordering Descending order");
		
		Collections.sort(emplist, comp);
		
		for(Employee lists:emplist) {
			System.out.println(lists);
		}

	}

}
