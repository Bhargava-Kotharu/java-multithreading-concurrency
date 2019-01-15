package com.bkotharu.threads.concurrency.phaser;

import java.util.concurrent.Phaser;

public class PhaserExample {

    public static void main(String[] args) {
	Phaser phaser = new Phaser(1);

	Thread thread1 = new Thread(new PhaserThread(1000, phaser));
	thread1.start();

	Thread thread2 = new Thread(new PhaserThread(2000, phaser));
	thread2.start();

	Thread thread3 = new Thread(new PhaserThread(3000, phaser));
	thread3.start();

	while (phaser.getPhase() != 3) {
	    System.out.println("Waiting for all phases to complete!");
	}
	System.out.println("All Phases completed execution.");
    }
}
