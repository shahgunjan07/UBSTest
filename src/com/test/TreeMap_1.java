package com.test;

import java.util.Iterator;
import java.util.TreeMap;

/**
 * What will be output of following program.
 * abc
 * @author shahg
 *
 */
public class TreeMap_1 {

	
	public void sampleMap() {
		TreeMap map = new TreeMap();
		map.put("a", "Hello");
		map.put("b", "Java");
		map.put("c", "World");

		Iterator it = map.keySet().iterator();
		while(it.hasNext()) {
			System.out.print(it.next());
		}
	}
	
	public static void main(String[] args) {
		TreeMap_1 junk = new TreeMap_1();
		junk.sampleMap();
	}
}
