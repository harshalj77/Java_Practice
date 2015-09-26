package com.cloudwick.java.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializableExample {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		
		UserSerialize obj=new UserSerialize();
		obj.setName("Fremont");
		obj.setSsn(24);
		
		FileOutputStream fos=new FileOutputStream("serialize.txt");
		ObjectOutputStream obs = new ObjectOutputStream(fos);
		obs.writeObject(obj);
		obs.close();
		fos.close();
		
		FileInputStream fis = new FileInputStream("serialize.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Object data = ois.readObject();
		if(data instanceof UserSerialize){
			UserSerialize obj2=(UserSerialize) data;
			System.out.println(obj2.getSsn());
			System.out.println(obj2.getName());
		}
		
		ois.close();
		fos.close();
		
		
		
	}

}
