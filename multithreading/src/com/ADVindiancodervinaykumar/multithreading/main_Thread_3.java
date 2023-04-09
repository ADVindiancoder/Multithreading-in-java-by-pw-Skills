package com.ADVindiancodervinaykumar.multithreading;

public class main_Thread_3 {

	public static void main(String[] args) {
		System.out.println("Main thread Started");
		
		System.out.println("Bina chnage kiye huye");
		
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
		
		
		System.out.println("Change karne ke bad");
		
		Thread t1= Thread.currentThread();
		t1.setName("ADV indian Coder");
		t1.setPriority(1);
		
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
		
		
		
	}

}
