package com.michael.threads;

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
	
	public ProducerThread (DataContainer dataContainer, int value) {
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

public class App {
	public static void main(String[] args) {
		DataContainer dc = new DataContainer();
		
		ProducerThread producer = new ProducerThread(dc, 40);
		ConsumerThread consumer = new ConsumerThread(dc);
		producer.start();
		consumer.start();
//		producer.setData(50);
		ProducerThread producer2 = new ProducerThread(dc, 40);
		producer2.start();
	}
}













