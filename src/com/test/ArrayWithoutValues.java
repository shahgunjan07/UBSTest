package com.test;

public class ArrayWithoutValues {
	
	
	private boolean arr[] = new boolean[2];
	
	public ArrayWithoutValues() {
		for (int i=0; i<arr.length; i++) {
			System.out.print(" "+arr[i]);
		}
	}
	
	public static void main(String[] args) {
		new ArrayWithoutValues();
		
		String[] strArr = new String[2];
		
		for (int i=0; i<strArr.length; i++) {
			System.out.print(" "+strArr[i]);
		}
	}

}
