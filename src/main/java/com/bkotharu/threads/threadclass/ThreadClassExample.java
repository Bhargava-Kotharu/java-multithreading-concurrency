package com.bkotharu.threads.threadclass;

/**
 * Thread example using Thread class
 * 
 * @author bkotharu
 *
 */
public class ThreadClassExample {

    public static void main(String[] args) {

	ThreadWithoutRunMethod hreadWithoutRunMethod = new ThreadWithoutRunMethod();

	// Doesn't do anything as thread's run method is not defined.
	hreadWithoutRunMethod.run();
	// This method is executed but not as a seperate thread.
	hreadWithoutRunMethod.execute();

	System.out.println("-----------------------");

	ThreadWithRunMethod threadWithRunMethod = new ThreadWithRunMethod();

	// Executes as a thread - Thread state will be NEW even after execution
	System.out.println(
		"ThreadWithRunMethod  state - Before executing run() " + threadWithRunMethod.getState().toString());
	threadWithRunMethod.run();
	System.out.println(
		"ThreadWithRunMethod  state - After executing run() " + threadWithRunMethod.getState().toString());

	System.out.println("-----------------------");

	// Executes as a thread - Changes the Thread state to RUNNABLE before executing
	// run()
	System.out.println(
		"ThreadWithRunMethod  state - After executing start() " + threadWithRunMethod.getState().toString());
	threadWithRunMethod.start();
	System.out.println(
		"ThreadWithRunMethod  state - After executing start() " + threadWithRunMethod.getState().toString());
    }
}
