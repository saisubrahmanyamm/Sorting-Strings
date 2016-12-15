/*By Sai Subrahmanyam
Date : 02-12-2016
Sorting of List elements in Alphabetical order By taking input from User(Main)*/
package com.sortingstring;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainController {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String value;
		List<String> userList = new ArrayList<String>();
		System.out.println("Enter how many Strings you want to enter?");
		int userNumber = Integer.parseInt(br.readLine());
		System.out.println("Enter " + userNumber + " number of strings into list.");
		for (int iterator = 0; iterator < userNumber; iterator++) {
			userList.add(value = br.readLine());
		}
		System.out.println("Original list of you have entered are : " + userList);
		Collections.shuffle(userList);
		System.out.println("\nAfter shuffling the list you entered are : " + userList);
		Collections.sort(userList);
		System.out.println("\nList after sorting are : " + userList);
	}

}
