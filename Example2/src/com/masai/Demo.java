package com.masai;

public class Demo {
	
	public static void main(String[] args) {
	
	String resource1 = "Water";
	String resource2 = "Spices";
		
	Runnable run1 = () -> {	
		
	synchronized (resource1) {
	
	System.out.println(Thread.currentThread().getName()+" have "+resource1);
	
	synchronized (resource2) {

		System.out.println(Thread.currentThread().getName()+" have "+resource2);
		
	}
		
		
	}			
		
	};
	
	Runnable ru2 = () -> {
		
	synchronized (resource2) {
	
		
	System.out.println(Thread.currentThread().getName()+" have "+resource2);
	
	synchronized (resource1) {
		
	System.out.println(Thread.currentThread().getName()+" have "+resource1);	
	}
		
		
		
		
	}	
		
	};
	
		
	
	
	Thread thread1 = new Thread(run1);
	thread1.setName("Ram");
	Thread thread2 = new Thread(ru2);
	thread2.setName("Shiv");
	
	thread1.start();
	thread2.start();
  	
		
		
		
		
	}
	
	
	
	
	

}
