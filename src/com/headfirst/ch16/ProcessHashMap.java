package com.headfirst.ch16;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * 
 * @author anirudh
 *
 */
public class ProcessHashMap {

	private Map<String, String> map = new HashMap<String, String>();

	private void populateMap() {
		map.put("A", "B");
		map.put("C", "D");
		map.put("E", "F");
	}

	/**
	 * Just iterate over map using Entry Set
	 */
	private void display() {
		for (Entry<String, String> entry : map.entrySet()) {
			System.out.println("Key :" + entry.getKey() + " Value :"
					+ entry.getValue());
		}
	}

	/**
	 * 
	 * To modify an element using KeySet
	 */
	private void alterMap() {
		Set<String> keySet = map.keySet();
		for (String key : keySet) {
			if (key.equals("A")) {
				map.put(key, "Iam modified");
			}
		}

	}

	public void go() {
		populateMap();
		display();
		System.out.println("Altering map");
		alterMap();
		display();

	}
}
