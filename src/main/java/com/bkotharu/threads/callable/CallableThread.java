package com.bkotharu.threads.callable;

import java.util.concurrent.Callable;

/**
 * Callable Thread
 * 
 * @author bkotharu
 *
 */
public class CallableThread implements Callable<Integer> {

    int x;
    int y;

    public CallableThread(int x, int y) {
	this.x = x;
	this.y = y;
    }

    public Integer call() throws Exception {
	System.out.println("Calculating sum of x and y!");
	Thread.sleep(1000);
	return x + y;
    }

}
