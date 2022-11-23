package com.java;

public class Overloading {
	private void customer_details(String name) {
System.out.println("Customername:"+name);
	}
	private void customer_details(int num,String name) {
System.out.println("Customernum"+num);
System.out.println("Customername"+name);
	}
private void Customer_details(int n1,int n2,int n3) {
	System.out.println("Customerprice"+n1+","+n2+","+n3);

}
public static void main(String[] args) {
	Overloading o=new Overloading();
	o.customer_details("Kathir");
	o.customer_details(82709, "vignesh");
	o.Customer_details(12, 13, 14);
}
}
//overloading
//polymorphism