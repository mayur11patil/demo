package com.app.sorting;

public class Laptops implements Comparable<Laptops> {
	
	private String brand;
	private int price;
	private int ram;
	
	public Laptops(String brand, int price, int ram) {
		super();
		this.brand = brand;
		this.price = price;
		this.ram = ram;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	@Override
	public String toString() {
		return "Laptops [brand=" + brand + ", price=" + price + ", ram=" + ram + "]";
	}

	public int compareTo(Laptops obj) {
		if(this.getRam() > obj.getRam())
			return 1;
		else
			return -1;
		
	}
}
