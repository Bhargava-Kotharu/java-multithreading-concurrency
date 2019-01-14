package com.bkotharu.threads.threadclass;

/**
 * Thread without overriding run() method.
 * 
 * @author bkotharu
 *
 */
public class ThreadWithoutRunMethod extends Thread {

    public void execute() {
	System.out.println(
		"Inside ThreadWithoutRunMethod execute()! - Not executed as a thread as run() method is not defined.");
    }

}
