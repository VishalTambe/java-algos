package com.vish.executor;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class MainExecutor {
	
	public static final int MAX_NUMBER = 2000000000;
	
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		long timeStart = Calendar.getInstance().getTimeInMillis();
		MyCallable m =  new MyCallable();
		MyCallable2 myCallable2 =  new MyCallable2();
		
		//Futu
		
		executorService.submit(m);
		executorService.submit(myCallable2);
		
		 Future<SettlementService> future = executorService.submit(myCallable2);
		
		try {
			System.out.println(future.get());
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		long timeEnd = Calendar.getInstance().getTimeInMillis();
        long timeNeeded = timeEnd - timeStart;
        System.out.println("Result calculated in " + timeNeeded + " ms");
        
        long timeStartFuture = Calendar.getInstance().getTimeInMillis();
        
        
        List<FutureTask<Integer>> taskList = new ArrayList<FutureTask<Integer>>();
        
        FutureTask<Integer> futureTask1 = new FutureTask<Integer>(m);
        FutureTask<Integer> futureTask2 = new FutureTask<Integer>(new TaskCallable());
        taskList.add(futureTask1);
        taskList.add(futureTask2);
        executorService.execute(futureTask1);
        executorService.execute(futureTask2);
        executorService.submit(new TaskCallable());
		executorService.submit(m);
        long timeEndFuture = Calendar.getInstance().getTimeInMillis();
        long timeNeededFuture = timeEndFuture - timeStartFuture;
        System.out.println("Result (Future): calculated in " + timeNeededFuture + " ms");
        executorService.shutdown();
	}
	
	
	
	

}
