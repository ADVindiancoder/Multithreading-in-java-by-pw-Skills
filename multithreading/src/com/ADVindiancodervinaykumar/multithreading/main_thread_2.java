package com.ADVindiancodervinaykumar.multithreading;


public class main_thread_2 {

	public static void main(String[] args) {
		System.out.println("main Thread");
		
		System.out.println("Before Change the name");
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
		
		System.out.println("After Change the name");
		
		
		Thread t1=Thread.currentThread();
		t1.setName("vinay Kumar");
		t1.setPriority(9);
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
		
		
	
		
		
		
		


	}

}
