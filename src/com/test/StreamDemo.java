package com.test;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamDemo {

	
	
	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(7);
		numbers.add(4);
		numbers.add(10);
		numbers.add(3);
		numbers.add(17);
		
		Stream<Integer> myStream = numbers.stream();
		
		Stream<Integer> myVals = numbers.stream().sorted().filter( n -> n %2 ==0);
		myVals = numbers.stream().filter(n-> n%2 == 1).filter(n -> n>5);
		
		myVals.forEach( n -> System.out.print( n+ " "));
	}
}
