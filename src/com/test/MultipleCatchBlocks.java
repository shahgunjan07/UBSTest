package com.test;

/**
 * What will be output of following program 
 * bde
 * @author shahg
 *
 */
public class MultipleCatchBlocks {

	public static void main(String[] args) {
		try {
			badMethod();
			System.out.println("a");
		} catch (RuntimeException ex) {
			System.out.println("b");
		} catch (Exception ex) {
			System.out.println("c");
		} finally {
			 System.out.println("d");
		}
		
		System.out.println("e");
	}
	
	static void badMethod() {
		throw new RuntimeException();
	}
}
