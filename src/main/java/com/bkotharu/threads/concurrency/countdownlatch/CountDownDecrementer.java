package com.bkotharu.threads.concurrency.countdownlatch;

import java.util.concurrent.CountDownLatch;

/**
 * CountDownDecrementer Thread decrements the counter
 * 
 * @author bkotharu
 *
 */
public class CountDownDecrementer implements Runnable {

    CountDownLatch latch = null;

    public CountDownDecrementer(CountDownLatch latch) {
	this.latch = latch;
    }

    public void run() {
	try {
	    Thread.sleep(1000);
	    this.latch.countDown();

	    Thread.sleep(1000);
	    this.latch.countDown();

	    Thread.sleep(1000);
	    this.latch.countDown();
	} catch (InterruptedException e) {
	    e.printStackTrace();
	}

    }

}