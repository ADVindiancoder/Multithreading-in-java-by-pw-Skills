package com.ADVindiancodervinaykumar.multithreading;
class demo extends Thread{
	
	public void run() {
		try {
			
			for(int i=0;i<=10;i++) {
				System.out.println("Under thread");
				Thread.sleep(2000);
			}
			
		}
		catch(Exception e) {
			System.out.println("Some Error");
		}
	}
}

class create extends Thread{
	
	public void run() {
		
		System.out.println("Just Checking");
	}
}
public class Join_method_in_multithreading {

	public static void main(String[] args)  throws Exception{
		
		
		System.out.println("main thread");
		
		demo d=new demo();
		d.start();
		d.join();
		
		create c=new create();
		c.start();

	}

}
