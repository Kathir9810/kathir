package com.java;

public class ClassF implements ClassD,ClassE{

	@Override
	public void name() {
		System.out.println("vicky");
	}
	@Override
	public void id() {
      System.out.println("kathir98");
		
	}
	@Override
	public void number() {
System.out.println("8270491329");		
	}
	@Override
	public void salary() {
      System.out.println("15000");		
	}
	@Override
	public void accno() {
System.out.println("1010000487");		
	}
	public static void main(String[] args) {
		ClassF f=new ClassF();
		f.name();
		f.id();
		f.number();
		f.salary();
		f.accno();
		}
	}
//interface_or_FullyAbstraction

