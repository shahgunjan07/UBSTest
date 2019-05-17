package com.test;

import java.util.HashMap;
import java.util.Map;

public class HashMapObjectEquality {

	/**
	 * As we have not overridden Equals and toString in Employee class Default
	 * implementation of Super class will be used for checking Object equality
	 * 
	 * Statement at Line : 21 overrides previously inserted value because we are
	 * using the same Object as Key.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Employee e1 = new Employee();

		Map<Employee, Integer> employeeIdList = new HashMap<>();
		employeeIdList.put(e1, 10);
		employeeIdList.put(e1, 50);
		employeeIdList.put(e1, 100);

		System.out.println(employeeIdList);
	}

}

class Employee {
	public String empId;
}
