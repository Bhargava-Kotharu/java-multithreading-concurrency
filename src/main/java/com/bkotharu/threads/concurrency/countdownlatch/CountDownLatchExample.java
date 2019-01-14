package com.bkotharu.threads.concurrency.countdownlatch;

import java.util.concurrent.CountDownLatch;

/**
 * In this CountDownLatchExample example, CountDownWaiter Thread waits until
 * CountDownDecrementer process is finished.
 * 
 * @author bkotharu
 *
 */
public class CountDownLatchExample {
    public static void main(String[] args) throws InterruptedException {
	CountDownLatch latch = new CountDownLatch(3);

	CountDownWaiter waiter = new CountDownWaiter(latch);
	CountDownDecrementer decrementer = new CountDownDecrementer(latch);

	new Thread(waiter).start();
	new Thread(decrementer).start();

	Thread.sleep(4000);
    }
}
