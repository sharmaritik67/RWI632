package com.program;

public class GroupThreadConstructor  extends Thread {
	public void run() {
		System.out.println(Thread.currentThread().isAlive());
	}
    public static void main(String[] args) {
    	GroupThreadConstructor thread=new GroupThreadConstructor();
    	System.out.println("Thread is start is or not ="+thread.isAlive());
    	thread.run();
    	
    	System.out.println("after starting a thread ="+thread.isAlive());
    	
    	
	}	

}
