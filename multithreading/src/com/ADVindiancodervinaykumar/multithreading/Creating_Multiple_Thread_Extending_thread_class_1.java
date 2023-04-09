package com.ADVindiancodervinaykumar.multithreading;
import java.util.*;

class Calculation extends Thread{
	
	public void run() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First Number");
		
		int no1=sc.nextInt();
		
		System.out.println("Enter the second number");
		int no2=sc.nextInt();
		
		int result=no1+no2;
		System.out.println("Addition Of Two Number Is : "+ result);
		
		
	}
	
}

class Chating extends Thread{
	
	public void run() {
	System.out.println("Let's Start the chating");
	System.out.println("Hii....");
	System.out.println("How are you!");
	System.out.println("What are you Doing?");
	
}
}


public class Creating_Multiple_Thread_Extending_thread_class_1 {

	public static void main(String[] args) {
		
		Calculation c=new Calculation();
		Chating ch=new Chating();
		
		ch.start();
		c.start();
		

	}

}
