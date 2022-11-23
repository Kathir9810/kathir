package com.java;

import java.util.Scanner;

public class Scanner_Class {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("enter the next value");
		String n = s.next();
		System.out.println(n);
		
		System.out.println("enter the next line");
		String l = s.nextLine();
		System.out.println(l);
		
		
		int i = s.nextInt();
		System.out.println(i);
		
		float f = s.nextFloat();
		System.out.println(f);
		
		char c = s.next().charAt(0);
		System.out.println(c);
		
		byte b = s.nextByte();
		System.out.println(b);
		
		short t = s.nextShort();
		System.out.println(t);
		
		double d = s.nextDouble();
	    System.out.println(d);
	 
	    String d1 = s.next().toString();
	    System.out.println(d1);
	    
	    boolean e = s.nextBoolean();
	    System.out.println(e);
	
	
	}
	//scanner
	
	
	
	
	
	
	
	
	
	
	
	

}
