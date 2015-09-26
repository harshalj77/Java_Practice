package com.cloudwick.java.core;

public class User {
	
	private int ssn;
	private String name;
	

	public int getSsn() {
		return ssn;
	}


	public void setSsn(int ssn) {
		this.ssn = ssn;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public boolean equals(Object o){
		
		if(o==null){
			return false;
		}
		
		if(!(o instanceof User)){
			return false;
		}
		User obj = (User) o;
		
		return this.getSsn()==obj.getSsn()
	        	&& this.getName().equals(obj.getName());
	}
	
	public int hashcode(){
		int hash = 7;
		hash +=hash*this.ssn;
		hash+=hash*(this.name==null?0:this.name.hashCode());
		return hash;
	}

}
