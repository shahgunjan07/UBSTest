package com.test;

public class ShorthadOperator {

	public static void main(String[] args) {
		int i = 2;
		int j = 3;
		
		i <<= j;
		
		//   i = 00000010
		//   j = 00000011
		//i<<j = 00010000
		System.out.println(i);
	}
}
