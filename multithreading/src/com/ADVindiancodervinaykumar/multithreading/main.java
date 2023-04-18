package com.ADVindiancodervinaykumar.multithreading;
class hii extends Thread{
public void run() {
	try {
	System.out.println("kya hal hai");
	Thread.sleep(3000);
	}
	catch(Exception e) {
		System.out.println(e);
		System.out.println("some changes");
	}
}
}
public class main {

	public static void main(String[] args) {
		System.out.println("maim branch started");
		
		hii h=new hii();
		
		h.start();
	}

}
