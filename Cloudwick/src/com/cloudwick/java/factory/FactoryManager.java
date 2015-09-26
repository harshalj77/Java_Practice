package com.cloudwick.java.factory;

public class FactoryManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AuthenticateInterface obj = UserFactory.getObject("Admin");
		obj.authenticate();
		obj=UserFactory.getObject("Super");
		obj = new SuperUser();


	}

}
