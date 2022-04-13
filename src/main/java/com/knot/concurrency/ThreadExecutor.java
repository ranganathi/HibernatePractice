package com.knot.concurrency;

public class ThreadExecutor {

	

	
	public static void main(String[] args) {
		
		
		Runnable am=new Account();
		
		Thread t1=new Thread(am);
		t1.setName("first thread");
		Thread t2=new Thread(am);
		t1.setName("second thread");
		t1.start();
		t2.start();
		
		
	}
	
}
