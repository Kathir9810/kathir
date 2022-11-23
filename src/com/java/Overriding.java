package com.java;

public class Overriding extends Loading{
@Override
public void name(String name) {
	super.name(name);
}
public static void main(String[] args) {
	Overriding s=new Overriding();
	s.name("codename");
}
}
//overriding
//polymorphism