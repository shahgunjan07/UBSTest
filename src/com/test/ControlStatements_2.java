package com.test;

/**
 * What will be output of following program.
 * Compilation error : as variable i is not initialized
 * @author shahg
 *
 */
public class ControlStatements_2 {

	public static void main(String[] args) {
		{
			int sum = 0;
			
			for (int i,j=0 ; i <5 & j<5 ; ++i,j=i+1)
				sum = sum + i;
			
			System.out.println(sum);
		}
	}
}
