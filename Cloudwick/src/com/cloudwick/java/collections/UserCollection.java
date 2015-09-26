package com.cloudwick.java.collections;

public class UserCollection implements Comparable<UserCollection> {
	private int ssn;
	private String name;
	public UserCollection(int s,String n){
		this.ssn=s;
		this.name=n;
	}
	@Override
	public int compareTo(UserCollection o) {
		// TODO Auto-generated method stub
		return this.ssn-o.ssn;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ""+this.ssn;
	}
	

}
