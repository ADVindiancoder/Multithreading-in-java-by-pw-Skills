package com.ADVindiancodervinaykumar.multithreading;
import java.util.*;
class MyThread implements Runnable{
	
	public void run() {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the first number");
		int number1=sc.nextInt();
		
		System.out.println("Enter the Second Number");
		int number2=sc.nextInt();
		
		int result=number1+number2;
		
		
		System.out.println("Addition of Two Number is :"+result);
		
	}
	
}

class chating implements Runnable{
	
	public void run() {
		
		System.out.println("How Are You");
	}
}

public class By_Implementing_Runnable_1 {


	public static void main(String[] args) {
		
		System.out.println("main Thread started");
		
		
		MyThread m=new MyThread();
		
		Thread t1=new Thread(m);
		Thread t2=new Thread();
		
		t1.start();
		t2.start();
		
		
		
	}

}
