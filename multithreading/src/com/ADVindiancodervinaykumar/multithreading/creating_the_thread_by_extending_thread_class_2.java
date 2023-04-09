package com.ADVindiancodervinaykumar.multithreading;

class demo2 extends Thread{
	
	public void run() {
		for(int i=0;i<3;i++) {
			
			System.out.println("Education is the key of Success");
		}
	}
}
public class creating_the_thread_by_extending_thread_class_2 {

	public static void main(String[] args) {
		System.out.println("Main thread started");
		
		demo2 d=new demo2();
		d.start();
		
		
		System.out.println("Ended");
		
	}

}
