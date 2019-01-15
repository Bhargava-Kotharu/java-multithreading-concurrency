package com.bkotharu.threads.concurrency.phaser;

import java.util.Date;
import java.util.concurrent.Phaser;

public class PhaserThread implements Runnable {

    private int waitTime;
    private Phaser phaser;

    public PhaserThread(int waitTime, Phaser phaser) {
	this.waitTime = waitTime;
	this.phaser = phaser;
    }

    public void run() {
	phaser.register();
	String threadName = Thread.currentThread().getName();
	String msg = "sese";
	System.out.printf("%-20s: %10s, t=%s, registered=%s, arrived=%s, unarrived=%s phase=%s%n", msg,
		Thread.currentThread().getName(), new Date().toString(), phaser.getRegisteredParties(),
		phaser.getArrivedParties(), phaser.getUnarrivedParties(), phaser.getPhase());
	try {
	    Thread.sleep(waitTime);
	} catch (InterruptedException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
	System.out.println(threadName + " : Finished Execution. Waiting for others to complete.");
	phaser.arriveAndAwaitAdvance();
	System.out.println(threadName + " : Ended Phase " + phaser.getPhase());
    }

}
