package com.app.collection;

import java.util.LinkedList;

public class LinkListOperation {

	public static void main(String[] args) {
		
		LinkedList<String> empList = new LinkedList<String>();
		
		empList.add("mayur");
		empList.add("patil");
		
		System.out.println("Linklist elements are: "+empList);
		
		empList.remove("patil");
		System.out.println("after remove linklist elements are: "+empList);
		
		System.out.println("size of linklist is: "+empList.size());
		
		System.out.println("mayur element present in list: "+empList.contains("mayur"));
		
		}

}
