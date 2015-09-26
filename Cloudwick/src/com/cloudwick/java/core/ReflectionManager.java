package com.cloudwick.java.core;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionManager {

	public static void main() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		UserManagement runMethod=new UserManagement();
		Method[] methods=runMethod.getClass().getMethods();
		for(Method method:methods){
			Audit obj=method.getAnnotation(Audit.class);
					if(obj!=null){
						System.out.println("Do Auditing");
						method.invoke(runMethod);
					}
			
			
		}
	}
}
