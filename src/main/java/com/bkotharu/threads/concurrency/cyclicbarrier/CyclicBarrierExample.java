package com.bkotharu.threads.concurrency.cyclicbarrier;

import java.util.concurrent.CyclicBarrier;

/**
 * In CyclicBarrierExample, BarrierAction Thread waits until the barrier is
 * reached. The barrier reaches only after all the WorkerThreads execution is
 * finished.
 * 
 * @author bkotharu
 *
 */
public class CyclicBarrierExample {

    public static void main(String[] args) {

	int numOfWorkerThreads = 5;
	CyclicBarrier barrier = new CyclicBarrier(numOfWorkerThreads, new BarrierAction());

	for (int i = 0; i < numOfWorkerThreads; i++) {
	    Thread worker = new Thread(new WorkerThread(barrier));
	    worker.setName("Thread " + i);
	    worker.start();
	}
    }
}
