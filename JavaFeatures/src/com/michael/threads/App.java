package com.michael.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class DataContainer {

	private int data;

	public synchronized int getData() {
		return this.data;
	}

	public synchronized void setData(int value) {
		this.data = value;
	}
}

class ProducerThread extends Thread {
	private DataContainer dataContainer;
	private int value;

	public ProducerThread(DataContainer dataContainer, int value) {
		this.dataContainer = dataContainer;
		this.value = value;
	}

	@Override
	public void run() {
		dataContainer.setData(value);
	}

}

class ConsumerThread extends Thread {
	private DataContainer dataContainer;

	public ConsumerThread(DataContainer dataContainer) {
		this.dataContainer = dataContainer;
	}

	@Override
	public void run() {
		System.out.println(dataContainer.getData());
	}
}

class Course {
	String courseName;
	int numOfSeats;

	public Course(String courseName, int numOfSeats) {
		this.courseName = courseName;
		this.numOfSeats = numOfSeats;
	}

	public synchronized void registerForCourse(int rollNo) {
		try {
			if (this.numOfSeats - 1 < 0) {
				this.wait(5000); // This releases the lock on the object and waits for 5 seconds
				if (this.numOfSeats - 1 < 0) // Check if any seat got released by the Cancellation
					throw new Exception("No more seats available for this course");
			}
			System.out.println("Booking successful!");
			this.numOfSeats -= 1;
			System.out.println("Available seats: " + this.numOfSeats);
		} catch (InterruptedException e) {
			System.out.println("Error: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

	public synchronized void cancelSeats() {
		try {
			this.numOfSeats += 1;
			System.out.println("Cancellation successful!");
			System.out.println("Available seats: " + this.numOfSeats);
			this.notify(); // Notifies one of the waiting threads to resume
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}

class RegisterThread extends Thread {
	Course c;

	RegisterThread(Course c) {
		this.c = c;
	}

	@Override
	public void run() {
		c.registerForCourse(1);
	}
}

class CancelRegistration extends Thread {
	Course c;

	CancelRegistration(Course c) {
		this.c = c;
	}

	@Override
	public void run() {
		c.cancelSeats();
	}
}

class DaemonThread extends Thread {

	public DaemonThread(String name) {
		super(name);
	}

	@Override
	public void run() {
		if (Thread.currentThread().isDaemon()) {
			System.out.println(getName() + " is Daemon thread");
		}

		else {
			System.out.println(getName() + " is User thread");
		}
	}
}

//class UploadResult extends Thread {
//	@Override
//	public void run() {
//		// code for uploading result
//		System.out.println("Upload Successful");
//	}
//}

class UploadResult implements Runnable {
	private String taskName;

	public UploadResult(String name) {
		taskName = name;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " (Start) " + taskName);
		// Code for uploading result: Dummy implementation
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(Thread.currentThread().getName() + " (End) " + taskName);
	}
}

class Task implements Runnable {
	private int counter;

	public Task(int counter) {
		this.counter = counter;
	}

	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}

	public int incrementCtr() {
		return counter++;
	}

	@Override
	public void run() {
		incrementCtr();
		System.out.println("Counter value:" + counter);

	}
}

public class App {

	public static void test1() {
		DataContainer dc = new DataContainer();

		ProducerThread producer = new ProducerThread(dc, 40);
		ConsumerThread consumer = new ConsumerThread(dc);
		producer.start();
		consumer.start();
//		producer.setData(50);
		ProducerThread producer2 = new ProducerThread(dc, 70);
		producer2.start();
	}

	public static void test2() {
		Course cse = new Course("CSE", 1);
		RegisterThread regObj1 = new RegisterThread(cse);
		regObj1.start();
		RegisterThread regObj2 = new RegisterThread(cse);
		regObj2.start();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Running a cancellation thread after 2 seconds
		CancelRegistration cancelObj1 = new CancelRegistration(cse);
		cancelObj1.start();
	}

	public static void test3() {
		DaemonThread thread1 = new DaemonThread("thread1");
		DaemonThread thread2 = new DaemonThread("thread2");
		DaemonThread thread3 = new DaemonThread("thread3");

		// Setting user thread t1 to Daemon
		thread1.setDaemon(true);

		// starting first 2 threads
		thread1.start();
		thread2.start();

		// Setting user thread t3 to Daemon
		thread3.setDaemon(true);
		thread3.start();
	}
	
	public static void assignment() {
		ExecutorService exService = Executors.newFixedThreadPool(3);
		Task task1 = new Task(2);
		Task task2 = new Task(3);
		exService.execute(task1);
		exService.execute(task2);
		exService.shutdown();
	}

//	public static void executorDemo() {
//		ExecutorService exService = Executors.newSingleThreadExecutor();// Line 1
//		UploadResult uploadRunnable1 = new UploadResult();
//		UploadResult uploadRunnable2 = new UploadResult();
//		exService.execute(uploadRunnable1);// Line 2
//		exService.execute(uploadRunnable2);// Line 3
//		exService.shutdown();
//	}

	public static void threadPoolDemo() {
		ExecutorService exServicePool = Executors.newFixedThreadPool(2); // Creating a thread Pool of size 2
		int noOfUploadTasks = 3; // Assuming we have 3 UploadResult task which needs to be processed
		for (int i = 1; i <= noOfUploadTasks; i++) {
			UploadResult uploadRunnable = new UploadResult("UploadResult:" + i);
			exServicePool.execute(uploadRunnable);
		}
		exServicePool.shutdown();
		while (!exServicePool.isTerminated()) {
		} // Checking if shutdown is complete
		System.out.println("Finished all threads");
	}

	public static void main(String[] args) {
//		threadPoolDemo();
		System.out.println(Runtime.getRuntime().availableProcessors());
	}
}







//class UploadResult implements Callable<Boolean> {
//	private String taskName;
//
//	public UploadResult(String name) {
//		taskName = name;
//	}
//
//	@Override
//	public Boolean call() throws Exception {
//		System.out.println(Thread.currentThread().getName() + " (Start) " + taskName);
//		// Code for uploading result: Dummy implementation
//		Boolean retValue = null;
//		try {
//			Thread.sleep(2000);
//			// code to Upload result
//			// Set retValue to true
//			retValue = Boolean.TRUE;
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//			// Set retValue to false
//			retValue = Boolean.FALSE;
//		}
//		System.out.println(Thread.currentThread().getName() + " (End) " + taskName);
//		return retValue;
//	}
//}
//
//
//class RunTaskService {
//	public static void main(String[] args) {
//		ExecutorService exService = Executors.newSingleThreadExecutor();
//		UploadResult uploadCallable = new UploadResult("Batch 1");
//		Future<Boolean> future = exService.submit(uploadCallable);
//		try {
//			System.out.println("Upload completed: " + future.get());
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
//		exService.shutdown();
//	}
//}