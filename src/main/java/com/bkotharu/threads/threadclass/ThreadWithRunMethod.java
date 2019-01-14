package com.bkotharu.threads.threadclass;

/**
 * Thread with run() overridden
 * 
 * @author bkotharu
 *
 */
public class ThreadWithRunMethod extends Thread {

    public void run() {
	System.out.println("Inside Thread run()!");
    }

}
