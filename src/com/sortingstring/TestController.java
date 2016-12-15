/*By Sai Subrahmanyam
Date : 02-12-2016
Sorting of List elements in Alphabetical order Test Cases*/
package com.sortingstring;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestController {

	public static void main(String[] args) {

		listExample1();
		listExample2();
		listExample3();

	}

	public static void listExample1() {
		List<String> listExample1 = new ArrayList<String>();
		listExample1.add("Sai");
		listExample1.add("Abbas");
		listExample1.add("Elephant");
		listExample1.add("Balu");
		listExample1.add("Duck");
		listExample1.add("Cat");
		listExample1.add("Zebra");
		listExample1.add("Ashok");
		listExample1.add("Yoco");
		listExample1.add("Height");
		System.out.println("Original list of ListExample1 are : " + listExample1);
		Collections.shuffle(listExample1);
		System.out.println("After shuffling ListExample2 are : " + listExample1);
		Collections.sort(listExample1);
		System.out.println("ListExample1 after sorting : " + listExample1 + "\n");
	}

	public static void listExample2() {
		List<String> listExample2 = new ArrayList<String>();
		listExample2.add("Zinc");
		listExample2.add("Abacus");
		listExample2.add("Yolk");
		listExample2.add("Ball");
		listExample2.add("Wipe");
		listExample2.add("Creed");
		listExample2.add("Viper");
		listExample2.add("Dark");
		listExample2.add("Xerox");
		listExample2.add("Gun");
		System.out.println("Original list of ListExample2 are : " + listExample2);
		Collections.shuffle(listExample2);
		System.out.println("After shuffling ListExample2 are : " + listExample2);
		Collections.sort(listExample2);
		System.out.println("ListExample2 after sorting : " + listExample2 + "\n");
	}

	public static void listExample3() {
		List<String> listExample3 = new ArrayList<String>();
		listExample3.add("Urban");
		listExample3.add("Flag");
		listExample3.add("Mohan");
		listExample3.add("Owl");
		listExample3.add("Tesla");
		listExample3.add("James");
		listExample3.add("Ink");
		listExample3.add("Obama");
		listExample3.add("Narendra Modi");
		listExample3.add("Kevin");
		System.out.println("Original list of ListExample3 are : " + listExample3);
		Collections.shuffle(listExample3);
		System.out.println("After shuffling ListExample3 are : " + listExample3);
		Collections.sort(listExample3);
		System.out.println("ListExample2 after sorting : " + listExample3 + "\n");
	}

}
