package com.headfirst.ch16;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class SortMountains {

	private LinkedList<Mountain> mountainList = new LinkedList<Mountain>();

	public void go() {

		mountainList.add(new Mountain("Everest", 7778));
		mountainList.add(new Mountain("K2", 6778));
		mountainList.add(new Mountain("NDevi", 7478));
		mountainList.add(new Mountain("Kilimanjaro", 5776));

		System.out.println("initial list :: " + mountainList);

		Comparator<Mountain> ascendinghc = new Comparator<Mountain>() {
			// if m1 >m2 return positive will sort ->Ascending
			@Override
			public int compare(Mountain m1, Mountain m2) {
				return m1.getHeight() - m2.getHeight();
			}
		};
		Comparator<Mountain> descendinghc = new Comparator<Mountain>() {
			// if m2 >m1 return positive will sort ->Descnding
			@Override
			public int compare(Mountain m1, Mountain m2) {
				return m2.getHeight() - m1.getHeight();
			}
		};
		
		System.out.println("Sorted on the basis of height Ascending**** ");
		Collections.sort(mountainList, ascendinghc);
		System.out.println(mountainList);
		
		System.out.println("Sorted on the basis of height Descending**** ");
		Collections.sort(mountainList, descendinghc);
		System.out.println(mountainList);

	}

	public static void main(String[] args) {
		SortMountains mountains = new SortMountains();
		mountains.go();
	}

}
