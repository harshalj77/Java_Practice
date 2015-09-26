package com.cloudwick.java.core;

final class UserImmutable {
	
	private int ssn;
	private String name;
	

	
	public UserImmutable(String n, int s){
		this.ssn=s;
		this.name=n;
	}



	public int getSsn() {
		return ssn;
	}



	public String getName() {
		return name;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
