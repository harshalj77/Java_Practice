package com.cloudwick.java.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExample {

	private static Map<Integer,String> dataMap;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		populateMap();
		loopEntryUsingMapEntry();
	}
	
	private static void populateMap(){
		dataMap = new HashMap<>();
		dataMap.put(2, "F");
		dataMap.put(32, "G");
		dataMap.put(1, "E");
		dataMap.put(32, "M");
		
	}
	
	private static void loopEntryUsingMapEntry()
	{
	for(Map.Entry<Integer,String> entry:dataMap.entrySet()){
		System.out.println("Key::\t"+entry.getKey()+"\tValue"+entry.getValue());
	}
		
	}
	
	public static void loopEntryUsingSetEntry(){
		Set<Entry<Integer, String>> entrySet=dataMap.entrySet();
		
	}

}
