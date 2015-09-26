package com.cloudwick.java.factory;

public class UserFactory {
	
	public static AuthenticateInterface getObject(String type){
		AuthenticateInterface obj = null;
		if(type.equals("Admin"))
			obj= new Admin();
		else if(type.equals("Super"))
		obj = new SuperUser();
		return obj;
			
	}

}
