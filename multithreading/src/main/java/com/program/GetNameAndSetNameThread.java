package com.program;

public class GetNameAndSetNameThread  extends  Thread{
	
	public void run() {
		System.out.println(Thread.currentThread().getName());
		System.out.println("Thread task1");
	}
	
	
	public void runs() {
		System.out.println(Thread.currentThread().getName());
	}

	
	public static void main(String[] args) {
		GetNameAndSetNameThread thread =new GetNameAndSetNameThread();
		
	thread.start();
	thread.runs();
	
	System.out.println(Thread.currentThread().getName());
	}
}
