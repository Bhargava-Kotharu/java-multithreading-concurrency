package com.bkotharu.threads.concurrency.semaphore;

import java.util.concurrent.Semaphore;

public class SemaphoreExample {

    public static void main(String[] args) {

	// Allows max 4 threads to access
	Semaphore semaphore = new Semaphore(4);

	System.out.println("Total available Semaphore permits : " + semaphore.availablePermits());

	for (int i = 0; i < 10; i++) {
	    Thread thread = new SemaphoreThread(semaphore);
	    thread.setName("Thread - " + i);
	    thread.start();
	}

    }
}
