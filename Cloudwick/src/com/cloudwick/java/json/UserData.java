package com.cloudwick.java.json;

import java.util.ArrayList;
import java.util.List;

// These are Model objects
public class UserData {
	
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public List<String> getPhone() {
		return phone;
	}
	public void setPhone(List<String> phone) {
		this.phone = phone;
	}
	private String state;
	private List<String> phone = new ArrayList(); 

}
