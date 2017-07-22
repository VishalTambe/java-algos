package com.vish.executor;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<Integer>{

	@Override
	public Integer call() throws Exception {
		
		for(int i=0;i<=20;i++){
			System.out.println("We are in MyCallable "+i);
			Thread.sleep(100);
		}
		
		return 0;
	}

}
