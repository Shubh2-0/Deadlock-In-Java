package com.masai;

public class Demo {
	
	public static void main(String[] args) {
	

	final String resource1 = "Printer";
	final String resource2 = "Scanner";
	
	Runnable ru1 = () -> {
	
	synchronized (resource1) {
		
		System.out.println(Thread.currentThread().getName()+": locked "+resource1);
		
	try {
		
		Thread.sleep(100);
		
	} catch (Exception e) {}
	
	synchronized (resource2) {
		
		System.out.println(Thread.currentThread().getName()+": locked "+resource2);
		
	}
		
		
		
	}	
		
		
		
	};
		
			
		
	Runnable ru2 = () ->{
		
	synchronized (resource2) {
		
		System.out.println(Thread.currentThread().getName()+": locked "+resource2);
	
		try {
			
			Thread.sleep(100);
			
		} catch (Exception e) {}
		
	
		synchronized (resource1) {
			
			System.out.println(Thread.currentThread().getName()+": locked "+resource1);
		}
		
		
	}	
		
	
	
		
		
	};
	
	Thread thread1 = new Thread(ru1);
	thread1.setName("Desktop");
	Thread thread2 = new Thread(ru2);
	thread2.setName("Laptop");
	
	
	thread1.start();
	thread2.start();
	
		
		
	}

}
