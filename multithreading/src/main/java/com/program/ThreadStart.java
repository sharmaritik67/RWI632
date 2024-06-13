package com.program;

public class ThreadStart implements Runnable {
	
	public void run() {
		System.out.println("This is thread class");
	}
	
	public static void main(String arg[]) {
		ThreadStart t=new ThreadStart();
		thread1 t1=new thread1();
		t1.start();
	}

}
