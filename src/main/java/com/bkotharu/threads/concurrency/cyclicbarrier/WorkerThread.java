package com.bkotharu.threads.concurrency.cyclicbarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * WorkerThread awaits until the barrier is reached. Barried reaches when all
 * the workers execution is completed
 * 
 * @author bkotharu
 *
 */
public class WorkerThread implements Runnable {

    private CyclicBarrier barrier;

    public WorkerThread(CyclicBarrier barrier) {
	this.barrier = barrier;
    }

    public void run() {
	System.out.println(Thread.currentThread().getName());

	try {
	    barrier.await();
	} catch (InterruptedException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	} catch (BrokenBarrierException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
    }

}
