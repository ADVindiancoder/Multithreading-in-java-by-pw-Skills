package com.ADVindiancodervinaykumar.multithreading;

public class main_thread_4 {

	public static void main(String[] args) {
		
        System.out.println("main Thread");
		
		System.out.println("Before Change the name");
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
		
		System.out.println("After Change the name");
		
		Thread th=Thread.currentThread();
		th.setName("shahu is my life");
		
		th.setPriority(4);
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
		

	}

}
