package com.ADVindiancodervinaykumar.multithreading;
import java.util.*;

class message extends Thread{
	public void run() {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Hey man let's Start the chating");
		System.out.println("Please say somthing");
		String name=s.next();
		
		System.out.println("How are you");
		String name1=s.next();
		
		System.out.println("what are you doing?");
		String name2=s.next();
		
		System.out.println("Do you use LinkedIn");
		String name3=s.next();
		
		System.out.println("Ok..By.............");
		String name4=s.next();
		
		
	}
}


class calculation extends Thread{
			
	public void run() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Here you can Perform calculation");
		
		System.out.println("Please enter the first number");
		int num1=sc.nextInt();
		System.out.println("Please enter the Second number");
		int num2=sc.nextInt();
		int vinay1=num1+num2;
		int vinay2=num1-num2;
		int vinay3=num1*num2;
		int vinay4=num1/num2;
				
		System.out.println("Press 1 for Addition, 2 for Subtraction, 3 for Multiplication, 4 for Division");
		int button = sc.nextInt();
		
		switch(button) {
			case 1: System.out.println("Addition of the numbers: "+ vinay1);
			break;
				
			case 2: System.out.println("Subtraction of the numbers: "+vinay2);
			break;
				
			case 3: System.out.println("Multiplication of the numbers: "+vinay3);
			break;
				
			case 4: System.out.println("Division of the numbers: "+vinay4);
			break;
				
			default: System.out.println("Sorry! I can only perform addition, subtraction, multiplication, and division");
		}
	}
}

class lunch{
	public static void main(String args[]) {
		message m=new message();
		m.start();
		
		calculation c=new calculation();
		c.start();
				
		
	}
}
