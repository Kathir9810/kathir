package com.java;

public class New {
	static int r = 5;
	static int t = 1;
	static int k = 1;
	public static void Me() {
		for (int i = r; i >=0; i--) {
			for (int j = i; j >0; j--) {
				System.out.print(" ");
				
			}
			while (k<=t) {
				System.out.print("* ");
				k++;
				
			}
			System.out.println();
			k=1;
			t++;
		}

	}
	public static void main(String[] args) {
		Me();
	}

}
