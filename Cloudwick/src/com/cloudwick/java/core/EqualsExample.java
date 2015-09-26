package com.cloudwick.java.core;

public class EqualsExample {
	
	  
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		User userObj = new User();
		userObj.setSsn(24);
        userObj.setName("Fremont");
       
        
        
        User userObj2 = new User();
       
        
        System.out.println("User Obj:"+userObj);
        System.out.println("User Obj2:"+userObj2);
        
      
      
        
        if(userObj.equals(userObj2)){
        	System.out.println("Objects Equals");
        }else
        {
        	System.out.println("Objects not equals");
        }
        
        
        if(userObj.getSsn()==userObj2.getSsn()
        	&& userObj.getName().equals(userObj2.getName())){
        	System.out.println("Objects are equal");
        }else{
        	System.out.println("Objects not equal");
        }
		
        System.out.println(userObj.equals(userObj2));
        
        UserImmutable userObj3=new UserImmutable("Fremont", 24);
    	System.out.println(userObj3.getName());
    	System.out.println(userObj3.getSsn());
	}
	
	
}
