package com.cloudwick.java.core;

public class EnumExample {

	public static void main(String[] args) {
		// Tight coupling first
		
		System.out.println(StateEnum.CA.getI());
		System.out.println(StateEnum.TX.getZ());
		System.out.println(StateEnum.UT.getC());
		
		//Loosely coupled 
		for(StateEnum e:StateEnum.values()){
			System.out.println(e.getC());
			System.out.println(e.getZ());
			System.out.println(e.getI());
		}

	}

}
