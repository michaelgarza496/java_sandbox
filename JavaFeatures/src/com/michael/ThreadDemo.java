package com.michael;

/*
 * 
 * 2 ways to make a thread
 * 	- extend thread class
 * 	- 
 *
 */

public class ThreadDemo {


	
}

/*
	Extending way
	1. Extend Thread class
	2. Override run() method to define operations for thread
	3. Create instance/s of thread and invoke start() method. The start method
	   begins the thread's execution where the JVM invokes the run() method. 
*/
class ExtendedThread extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
	}
	
}