package com.cloudwick.java.json;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.map.ObjectMapper;

public class JacksonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//parseJsonData();
		writeDate();
	}

	private static void parseJsonData() {
		UserData obj = new UserData();
		ObjectMapper mapper = new ObjectMapper();
		try {
			UserData obj2 = mapper.readValue(new File("Data.json"),
					UserData.class);
			System.out.println("Name:" + obj2.getName());
			System.out.println("State:" + obj2.getState());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public static void writeDate(){
		UserData obj = new UserData();
		obj.setName("ABC");
		obj.setState("DE");
		obj.getPhone().add("Office");
		ObjectMapper mapper = new ObjectMapper();
		try {
			mapper.writeValue(new File("newdata.json"),obj);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
