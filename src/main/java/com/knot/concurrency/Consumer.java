package com.knot.concurrency;

import java.util.Queue;

public class Consumer extends Thread { 
	private Queue<Integer> queue; 
	private int maxSize; 
	public Consumer(Queue<Integer> queue, int maxSize, String name){ 
		super(name);
		this.queue = queue; 
		this.maxSize = maxSize; 
		} 
	@Override public void run() { 
		while (true) {
			synchronized (queue) {
				while (queue.isEmpty()) { 
					System.out.println("Queue is empty," + "Consumer thread is waiting" + " for producer thread to put something in queue"); 
					try { 
						System.out.println("consumer thread wait :"+Thread.currentThread().getName());

						queue.wait(); 
						} catch (Exception ex) { 
							ex.printStackTrace(); } 
					} 
				System.out.println("Consuming value : " + queue.remove()); 
				System.out.println("consumer thread wait :"+Thread.currentThread().getName());

				queue.notifyAll(); 
				} 
			}
		}


}
