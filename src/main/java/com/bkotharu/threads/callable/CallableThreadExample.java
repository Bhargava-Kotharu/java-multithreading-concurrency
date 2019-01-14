package com.bkotharu.threads.callable;

/**
 * Thread example using Callable interface
 * 
 * @author bkotharu
 *
 */
public class CallableThreadExample {

    public static void main(String[] args) throws Exception {

	CallableThread thread = new CallableThread(10, 20);

	Integer result = thread.call();

	System.out.println("Callable thread result: " + result.intValue());
    }
}
