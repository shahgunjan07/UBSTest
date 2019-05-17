package com.test;

/**
 * What will be output of following JAVA program :
 * Result : 6
 * @author shahg
 *
 */
public class ControlStatements_1 {

	public static void main(String[] args) {
		{
			int sum = 0;
			
			for (int i=0,j=0 ; i <5 & j<5 ; ++i,j=i+1)
				sum = sum + i;
			
			System.out.println(sum);
		}
	}
}
