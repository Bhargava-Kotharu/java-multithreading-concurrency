package com.bkotharu.threads.concurrency.exchanger;

import java.util.concurrent.Exchanger;

/**
 * ExchangerThread exchanges Integer object between threads after a certain
 * point in the execution.
 * 
 * @author bkotharu
 *
 */
public class ExchangerThread implements Runnable {

    Integer value;
    private Exchanger<Integer> exchanger;

    public ExchangerThread(Exchanger<Integer> exchanger) {
	this.exchanger = exchanger;
    }

    public void run() {
	String threadName = Thread.currentThread().getName();
	System.out.println(threadName + ": Execution Started!");

	try {
	    // Sleeping for 2 seconds in case of Thread1 and 4 seconds for Thread2
	    Thread.sleep(threadName.equals("THREAD1") ? 2000 : 4000);

	    System.out.println(threadName + ": Finished Execution waiting for exchange!");

	    // Let's exchange a value of 10 in case of THREAD1 and 20 otherwise
	    value = exchanger.exchange((threadName.equals("THREAD1")) ? 10 : 20);
	} catch (InterruptedException e) {
	    e.printStackTrace();
	}

	System.out.println(threadName + ": Exchanged value : " + value);

    }

}
