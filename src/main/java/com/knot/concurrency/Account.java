package com.knot.concurrency;

public class Account implements Runnable {

	private  int amount;
	
	
	{
		amount=100;
	}
	
	
	
	synchronized void  setDeposit(int x) {
		
		amount=amount+x;
		System.out.println("thread accessing set deposit :"+Thread.currentThread().getName() +" amount:"+amount);

	}
	
	synchronized void setWithdrawl(int y) {
		amount=amount-y;
		System.out.println("thread accessing set withdrawl :"+Thread.currentThread().getName() +" amount:"+amount);
	}
	
	
	synchronized void printAmount() {
		System.out.println("thread accessing print amount :"+Thread.currentThread().getName() +" amount:"+amount);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		setWithdrawl(15);
		setDeposit(10);
		printAmount();
	}
	
	
}
