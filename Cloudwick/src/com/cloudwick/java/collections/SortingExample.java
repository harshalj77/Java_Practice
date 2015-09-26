package com.cloudwick.java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List aList = new ArrayList();
		aList.add(24);
		aList.add(1);
		aList.add(80);
		aList.add(7);

		for (Object i : aList) {
			System.out.println((Integer) i);
		}

		Collections.sort(aList);
		for (Object i : aList) {
			System.out.println((Integer) i);
		}

	    List userList = new ArrayList();
	    userList.add(new UserCollection(24,"F"));
	    userList.add(new UserCollection(1,"G"));
	    userList.add(new UserCollection(18,"A"));
	    Collections.sort(userList);
	    System.out.println("After Comparable::\n");
	    for (Object i : userList) {
	    		    	
			System.out.println((UserCollection)i);
		}
	}

}
