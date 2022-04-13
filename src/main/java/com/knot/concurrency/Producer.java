package com.knot.concurrency;

import java.util.Queue;
import java.util.Random;

public class Producer extends Thread { 
	private Queue<Integer> queue; 
	private int maxSize; 
	public Producer(Queue<Integer> queue, int maxSize, String name){ 
		super(name); this.queue = queue; 
		this.maxSize = maxSize;
		} 
	@Override 
	public void run() { 
		while (true) { 
			synchronized (queue) { 
				while (queue.size() == maxSize) { 
					try { 
						System.out .println("Queue is full, " + "Producer thread waiting for " + "consumer to take something from queue"); 
						System.out.println("producer thread wait :"+Thread.currentThread().getName());
						queue.wait(); 
						} 
					catch (Exception ex) { 
						ex.printStackTrace(); 
						} 
					} 
				Random random = new Random(); 
				int i = random.nextInt(); 
				System.out.println("Producing value : " + i); 
				queue.add(i); 
				System.out.println("producer thread notify:"+Thread.currentThread().getName());

				queue.notifyAll(); 
				} 
			} 
		}


}
