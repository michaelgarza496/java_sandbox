package com.michael;

class ThreadClass extends Thread
{
	public ThreadClass()
	{
		System.out.println(Thread.currentThread().getPriority());
	}
	
	synchronized public void run2() {
		
	}
}
public class Priority 
{
	public static void main(String[] args) 
	{
		new ThreadClass();
	}
}