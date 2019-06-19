package com.app.sorting;

public class Employee {
	
	private String name;
	private String company;
	private int id;
	
	public Employee(String name, String company, int id) {
		super();
		this.name = name;
		this.company = company;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", company=" + company + ", id=" + id + "]";
	}

}
