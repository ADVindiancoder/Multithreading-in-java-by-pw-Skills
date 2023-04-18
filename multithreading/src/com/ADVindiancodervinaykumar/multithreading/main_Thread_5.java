package com.ADVindiancodervinaykumar.multithreading;
import java.util.*;
class vinay extends Thread{
	 public void run() {
		 
		 Scanner s=new Scanner(System.in);
		 System.out.println("Let's try to add two number");
		 System.out.println();
		 System.out.println("Please! Enter the first number");
		 int a=s.nextInt();
		 System.out.println("Please! Enter the Second number");
		 int b=s.nextInt();
		 
		 int c=a+b;
		 
		 System.out.print(c);
	 }
	 
}
class shahu extends Thread{
	
 public void run() {
		 
		 try {
			 for(int i=0;i<=3;i++) {
				 System.out.println("vinay kumar");
				 Thread.sleep(3000);
			 }
		 }
			 catch(Exception e) {
				 System.out.println(e);
				 System.out.println("Some Error that is :"+e);
			 }
		 
		 }
		
}

public class main_Thread_5 {
	public static void main(String args[]) throws Exception {
		
		System.out.println("Main Thread Started");
		
		String name=Thread.currentThread().getName();
		System.out.println(name);
		
		vinay ch=new vinay();
		ch.start();
		ch.join();
		shahu s=new shahu();
		s.start();
		s.join();
		
		
	}

}
