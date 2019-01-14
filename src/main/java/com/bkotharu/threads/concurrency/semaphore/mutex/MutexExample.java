package com.bkotharu.threads.concurrency.semaphore.mutex;

import java.util.concurrent.Semaphore;

import com.bkotharu.threads.concurrency.semaphore.SemaphoreThread;

public class MutexExample {

    public static void main(String[] args) {

	// Allows only 1 thread to access
	Semaphore semaphore = new Semaphore(1);

	System.out.println("Total available Semaphore permits : " + semaphore.availablePermits());

	for (int i = 0; i < 10; i++) {
	    Thread thread = new SemaphoreThread(semaphore);
	    thread.setName("Thread - " + i);
	    thread.start();
	}

    }
}
