
package com.cloudwick.java.threads;



public class UserThread extends Thread {
	int count;
	
public UserThread(int count)
{
	this.count=count;
}
	
	
	public void run(){
		int sum=0;
		for(int i=0;i<count;i++){
			sum+=i;
			System.out.println("Total is::\t"+sum+"for:"+Thread.currentThread());
		}
	}

}
