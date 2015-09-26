package com.cloudwick.java.json;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonSimpleManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		writeJsonDate();
		//readJsonDate();

	}

private static void  writeJsonDate(){
	JSONObject obj = new JSONObject();
	    obj.put("name", "Fremont");
	    obj.put("state", "CA");
    JSONArray arr = new JSONArray();
    arr.add("Office");
    arr.add("Home");
    arr.add("Mobile");
    obj.put("phone", arr);
    
    try {
		FileWriter writer = new FileWriter("Data.json");
		writer.write(obj.toJSONString());
		writer.flush();
		writer.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    

}
public static void readJsonDate(){
	JSONParser parser = new JSONParser();
	try {
		Object obj = parser.parse(new FileReader("Data.json"));
		JSONObject dateObj=(JSONObject) obj;
		String name = (String) dateObj.get("name");
		String state = (String) dateObj.get("state");
		JSONArray arr =(JSONArray) dateObj.get("phone");
		
		Iterator<String> itr = arr.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		System.out.println(""+name);
		System.out.println(""+state);
		
		
	} catch (IOException | ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}

}
