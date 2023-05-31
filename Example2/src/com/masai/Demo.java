package com.masai;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo {
	
	public static void main(String[] args) throws FileNotFoundException {
	
	String resource1 = "Water";
	String resource2 = "Spices";
		
	Runnable run1 = () -> {	
		
	synchronized (resource1) {
	
	System.out.println(Thread.currentThread().getName()+" have "+resource1);
	
	try {
		
		resource1.wait(1000);
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	synchronized (resource2) {

		System.out.println(Thread.currentThread().getName()+" have "+resource2);
		
	}
		
		
	}			
		
	};
	
	Runnable ru2 = () -> {
		
	synchronized (resource2) {
	
		
	System.out.println(Thread.currentThread().getName()+" have "+resource2);
	
	
	try {
		resource2.wait(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated cathch block
		e.printStackTrace();
	}
	
	synchronized (resource1) {
		
	System.out.println(Thread.currentThread().getName()+" have "+resource1);
	
	resource1.notify();
	}
		
		
		
		
	}	
		
	};
	
		
	
	
	Thread thread1 = new Thread(run1);
	thread1.setName("Ram");
	Thread thread2 = new Thread(ru2);
	thread2.setName("Shiv");
	
	thread1.start();
	thread2.start();
//  	
//		PrintWriter r = new PrintWriter("abc.txt");
//		
//		r.write("helloj");
//		r.write("helloj");
//		r.write("helloj");
//		r.write("helloj");
//		
//		r.flush();
		
//		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
//		
//		File file = new File("absh.txt");
//		PrintStream pw = null;
//		try {
//			pw = new PrintStream(file);
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
//		
//		pw.println("Anuj 56.25 77.58");
//		pw.println("Bharat 66.25 57.58");
//		pw.println("Chaman 70.25 66.74");
//		pw.println("Dhanush 58.25 95.74");
//		pw.println("Garv 58.62 95.74");
//		
//		int count = list.stream().reduce(0, (e,ee) -> e+ee);
//		
//		System.out.println(count);
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	

}
