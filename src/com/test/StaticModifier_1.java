package com.test;

/**
 * What will be output of following code snippet ?
 * 
 * Outcome : static can not be used on constructor. Only public, private,
 * protected allowed on constructor
 * 
 * @author shahg
 *
 */
public class StaticModifier_1 {

	private StaticModifier_1(int i) {

	}

	public static StaticModifier_1() {

	}

	public static void main(String[] args) {
		StaticModifier_1 obj = new StaticModifier_1(10);

	}
}
