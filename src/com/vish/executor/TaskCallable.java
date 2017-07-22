package com.vish.executor;

import java.util.concurrent.Callable;

public class TaskCallable implements Callable<Integer>{

	@Override
	public Integer call() throws Exception {
		for(int i=0;i<=20;i++){
		System.out.println("TaskCallable "+i);
		}
		return 10;
	}
	
	public static int amountOfDivisibleBy(int first, int last, int divisor) {
		 
        int amount = 0;
        for (int i = first; i <= last; i++) {
            if (i % divisor == 0) {
                amount++;
            }
        }
        return amount;
    }

}
