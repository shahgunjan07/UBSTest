package com.test;

public class OperatorPrecedence_1 {

	
	public static void main(String[] args) {
		int z =8;
		z/=z--;
		//z = z / z--;
		System.out.println(z);
	}
}
