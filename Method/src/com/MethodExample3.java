package com;

public class MethodExample3 {
	String print() {
		return "Hi Student";
	}

	public static void main(String args[]) {
		MethodExample3 me3 = new MethodExample3();

		// 1st way
		String result = me3.print();
		System.out.println(result);

		// 2nd way
		System.out.println(me3.print());
	}
}
