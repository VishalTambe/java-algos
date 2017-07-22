package com.vish.executor;

import java.util.concurrent.Callable;

public class MyCallable2 implements Callable<SettlementService>{

	@Override
	public SettlementService call() throws Exception {
		for(int i=0;i<=20;i++){
			System.out.println("In SettlementService "+i);	
		}
		
		return new SettlementService();
	}

}
