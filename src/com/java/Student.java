package com.java;

public class Student {
	public  Student() {
System.out.println("Skv School");
	}
public  Student(String name) {
System.out.println(name);
}
	public  Student(int num) {

		System.out.println(num);
	}
	public Student(char value) {
	System.out.println(value);

	}
	public static void main(String[] args) {
		Student s=new Student();
		Student s1=new Student("kathir");
		Student s2=new Student(16028);
		Student s3=new Student('A');
		
	}
	
}
//Constructor