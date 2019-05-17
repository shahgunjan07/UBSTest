package com.test;

public class IntegerOvewflow {

	/**
	 * Java does not have target typing, a language feature wherein the type of the
	 * variable in which a result is to be stored influences the type of the
	 * computation.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		final long MICROS_PER_DAY = 24 * 60 * 60 * 1000 * 1000;
		final long MILLIS_PER_DAY = 24 * 60 * 60 * 1000;
		System.out.println(MICROS_PER_DAY / MILLIS_PER_DAY);

	}
}
