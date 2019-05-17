package com.test;

public class LongMaxRange {

	public static void main(String[] args) {

		long a = 24 * 60 * 60 * 1000 * 1000;
		System.out.println(a);
		long b = 24 * 60 * 60 * 1000;
		System.out.println(b);
		System.out.println(Long.MAX_VALUE);
		System.out.println(a / b);

		
		long c = Long.MAX_VALUE + 10 ;
		
		System.out.println(c);
		
		byte i = (byte) (Byte.MAX_VALUE + 2) ;
		System.out.println( i);
	}
}
