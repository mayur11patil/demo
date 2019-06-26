package com.app.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOperation {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<10;i++) {
			list.add(i);
		}
		
		Stream<Integer> stream = list.stream();
		stream.forEach(System.out::println);
		
		System.out.println("**********************************************");
		System.out.println("find min max no");
		int minno = list.stream().min(Comparator.comparing(Integer::valueOf)).get();
		System.out.println("min no from list: "+minno);
		
		int maxno = list.stream().max(Comparator.comparing(Integer::valueOf)).get();
		System.out.println("max no from list: "+maxno);
		
		/**
		 * The 'if-else' condition can be put as a lambda expression in stream.
		 * forEach() function in form of a Consumer action.
		 */
		Consumer<Integer> action = i -> {
			if(i % 2 == 0) {
				System.out.println("Even No:: "+i);
			}
			else {
				System.out.println("Odd No ::"+i);
			}
		};
		list.stream().forEach(action);
		
		/**
		 * If we intend to apply only 'if' logic then we can pass the condition directly do the filter() function.
		 * In given example, we are checking if a number id even then print a message.
		 */
		System.out.println("*******************************************************");
		list.stream().filter(i -> i%2==0).forEach(System.out::println);
		
		List<String> listOf = new ArrayList<>();
		List<String> memberNames = new ArrayList<>();
		memberNames.add("Amitabh");
		memberNames.add("Shekhar");
		memberNames.add("Aman");
		memberNames.add("Rahul");
		memberNames.add("Shahrukh");
		memberNames.add("Salman");
		memberNames.add("Yana");
		memberNames.add("Lokesh");
		
		System.out.println("Printing List Of Stream");
		Stream<String> nameStream = memberNames.stream();
		nameStream.forEach(System.out::println);
		
		System.out.println("**********************************************");
		System.out.println("Use of filters on stream");
		/** Stream.filter() Method
		 * Filter accepts a predicate to filter all elements of the stream. 
		 * This operation is intermediate which enables us to call another stream operation (e.g. forEach) on the result.
		 */
		memberNames.stream().filter((s) -> s.startsWith("A"))
			.forEach(System.out::println);
		
		System.out.println("**********************************************");
		System.out.println("use of map on stream");
		/** Stream.map() method
		 * The intermediate operation map converts each element into another object via the given function. 
		 * The following example converts each string into an upper-cased string. 
		 * But you can also use map to transform each object into another type.
		 */
		
		memberNames.stream().filter((s) -> s.startsWith("R"))
			.map(String::toUpperCase)
			.forEach(System.out::println);
		
		memberNames.stream().filter((s) -> s.startsWith("R"))
		.map(String::toLowerCase)
		.forEach(System.out::println);
	
		/**  Stream.sorted() method
		 * Sorted is an intermediate operation which returns a sorted view of the stream. 
		 * The elements are sorted in natural order unless you pass a custom Comparator.
		 */
		System.out.println("**********************************************");
		System.out.println("Sorting of stream");
		memberNames.stream().sorted()
							.forEach(System.out::println);
		
		System.out.println("Terminal operation on stream");
		/** Stream.collect() 
		 * collect() method used to recieve elements from a stream and store them in a collection and mentioned in parameter function.
		 */
		
		System.out.println("**********************************************");
		System.out.println("COllecting stream data to another list");
		
		listOf = memberNames.stream().filter((s) -> s.startsWith("R"))
		.map(String::toLowerCase)
		.collect(Collectors.toList());
		
		System.out.println("Printing collected list data :"+listOf);
		
		/** Stream.match() 
		 * Various matching operations can be used to check whether a certain predicate matches the stream. 
		 * All of those operations are terminal and return a boolean result.
		 */
		
		System.out.println("**********************************************");
		System.out.println("Use of Various match operation on stream");
		boolean matchresult = memberNames.stream()
										 .anyMatch((s) -> s.startsWith("A"));
		System.out.println("Any match operation starts with A :"+matchresult);
		
		matchresult = memberNames.stream()
							      .allMatch((s) -> s.startsWith("A"));
		System.out.println("All match operation starts with A :"+matchresult);
		
		matchresult = memberNames.stream()
							     .noneMatch((s) -> s.startsWith("A"));
		System.out.println("None match operation starts with A :"+matchresult);
	
		/** Stream.count()
		 * Count is a terminal operation returning the number of elements in the stream as a long.
		 */
		
		long length = memberNames.stream().filter((s) -> s.startsWith("A"))
															.count();
		System.out.println("number of elements in stream starts with a: "+length);
		
		/** Stream.reduce()
		 * This terminal operation performs a reduction on the elements of the stream with the given function. 
		 * The result is an Optional holding the reduced value.
		 */
		
		System.out.println("**********************************************");
		System.out.println("Use of reduced on stream");
		Optional<String> opt = memberNames.stream().reduce((s1,s2) -> s1 + s2);
		opt.ifPresent(System.out::println);
	
		System.out.println("**********************************************");
		System.out.println("Min Max String from list(char)");
		String min=memberNames.stream().min(Comparator.comparing(String::valueOf)).get();
		System.out.println("Min String from list: "+min);
		
	}
}
