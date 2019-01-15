package com.bkotharu.threads.concurrency.exchanger;

import java.util.concurrent.Exchanger;

/**
 * Exchanger Example
 * 
 * @author bkotharu
 *
 */
public class ExchangerExample {

    public static void main(String[] args) {

	Exchanger<Integer> exchanger = new Exchanger<Integer>();

	Thread thread1 = new Thread(new ExchangerThread(exchanger));
	thread1.setName("THREAD1");
	thread1.start();

	Thread thread2 = new Thread(new ExchangerThread(exchanger));
	thread2.setName("THREAD2");
	thread2.start();

    }
}
