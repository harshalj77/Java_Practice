package com.cloudwick.java.threads;

import java.util.concurrent.Callable;

public class UserCallableThread implements Callable<Integer> {
	int count;

	public UserCallableThread(int counter) {
		this.count = counter;

	}

	@Override
	public Integer call() {
		int sum = 0;
		for (int i = 0; i < count; i++) {
			sum += i;
		}
		System.out.println("Total is::\t" + sum + "for:"
				+ Thread.currentThread());
		return sum;

	}

}
