package com.cloudwick.java.core;

public class UserManagement {
	
	@Audit
	public void printResult(){
		System.out.println("Printing Data from printResult");
	}
	
	public void print(){
		System.out.println("Printing Data from printMethod");
	}

}
