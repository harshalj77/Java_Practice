// Thread Example Bad Practice though it works

package com.cloudwick.java.threads;

import java.util.ArrayList;
import java.util.List;

public class ThreadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Thread> tList = new ArrayList<>();
		for (int i = 1; i < 501; i++) {
			UserThread obj = new UserThread(1000 + i);
			obj.setName("Cloudwick" + i);
			if (i > 50 && i < 100) {
				obj.setPriority(Thread.MIN_PRIORITY);
			}
			obj.start();
			tList.add(obj);
		}
		
		int running=0;
		do{
			//Enhanced for loop
			running=0;
			for(Thread t:tList){
				if(t.isAlive()){
					running++;
				}
				
			}
		}while(running!=0);

		System.out.println("All work done");

	}

}
