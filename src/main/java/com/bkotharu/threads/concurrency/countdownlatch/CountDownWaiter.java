package com.bkotharu.threads.concurrency.countdownlatch;

import java.util.concurrent.CountDownLatch;

/**
 * CountDownWaiter Thread awaits until countdown is completed and then starts
 * the processing
 * 
 * @author bkotharu
 *
 */
public class CountDownWaiter implements Runnable {

    CountDownLatch latch = null;

    public CountDownWaiter(CountDownLatch latch) {
	this.latch = latch;
    }

    public void run() {
	try {
	    long millis = System.currentTimeMillis();
	    System.out.println("Waiting for the countdown");
	    latch.await();
	    System.out.println("Countdown finished " + (System.currentTimeMillis() - millis));
	} catch (InterruptedException e) {
	    e.printStackTrace();
	}

	System.out.println("Waiter Released");
    }

}
