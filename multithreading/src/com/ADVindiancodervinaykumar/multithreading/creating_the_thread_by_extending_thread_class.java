package com.ADVindiancodervinaykumar.multithreading;

class Demo1 extends Thread{
	
	public void run() {
		
		for(int i=0;i<4;i++) {
			
			try {
				
				System.out.println("Focusis the key");
				Thread.sleep(2000);
			}
			
			catch(Exception e) {
				
				System.out.println("Some Error.....");
			}
		}
	}
}

public class creating_the_thread_by_extending_thread_class {

	public static void main(String[] args) {
		
		Demo1 d=new Demo1();
		d.start();
		
		System.out.println("End The Printing");
	}

}
