package com.ADVindiancodervinaykumar.multithreading;

class checking extends Thread{

	public void run() {

		for(int i=0;i<3;i++) {
			
			try {
				System.out.println("Life is hard but not Impossible");
				Thread.sleep(3000);
			}
			catch(Exception e) {
				System.out.println("somthing Went Wrong");
			}
		}
		
		
	}
}
		

public class creating_the_thread_by_extending_thread_class_3 {

	public static void main(String[] args) {
		System.out.println("main thread started");
		
		checking c=new checking();
		c.start();
		
		System.out.println("At last");

	}

}
