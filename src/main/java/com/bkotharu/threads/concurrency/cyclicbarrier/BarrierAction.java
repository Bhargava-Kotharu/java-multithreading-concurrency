package com.bkotharu.threads.concurrency.cyclicbarrier;

/**
 * BarrierAction is executed after all the workers are finished.
 * 
 * @author bkotharu
 *
 */
public class BarrierAction implements Runnable {

    public void run() {
	System.out.println("Barrier Action - All Worker threads finished execution.");
    }

}
