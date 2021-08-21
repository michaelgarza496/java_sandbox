package com.michael;

/*
 * 
 * 2 ways to make a thread
 * 	- extend thread class
 * 	- 
 *
 */

public class ThreadDemo {

	public static void main(String[] args) throws InterruptedException {
		ExtendedThread extendedThread = new ExtendedThread();
		extendedThread.start();
		System.out.println(extendedThread.isAlive());

		extendedThread.join();
		System.out.println(extendedThread.isAlive());
		Thread.sleep(3000);

		new Thread(new ImplementRunnable()).start();
		System.out.println("Main method thread ends");
	}

}

/*
 * Extending way 1. Extend Thread class 2. Override run() method to define
 * operations for thread 3. Create instance/s of thread and invoke start()
 * method. The start method begins the thread's execution where the JVM invokes
 * the run() method.
 */
class ExtendedThread extends Thread {

	@Override
	public void run() {
		System.out.println("Extended run()");
	}

}

class ImplementRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println("Implemented run()");

	}

}