package com;

public class MethodExample2 {
	public void add(int a, int b) {
		int sum = a + b;
		System.out.println("The sum of " + a + " & " + b + " is " + sum);
	}

	public static void main(String args[]) {

		MethodExample2 me2 = new MethodExample2();

		me2.add(10, 20);
		me2.add(30, 40);
		me2.add(50, 60);
	}
}
