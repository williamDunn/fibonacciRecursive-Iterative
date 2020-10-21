package fib;

import java.util.Scanner;

public class Iterative {

	public static void main(String[] args) {
		System.out.println("i");
		System.out.println("Enter an integer value");

		Scanner kbd = new Scanner(System.in);

		int val = kbd.nextInt();

		System.out.println("");

		long start = System.currentTimeMillis();

		fibIteration(val);

		long end = System.currentTimeMillis();

		System.out.println("time: " + (end - start));
		
		kbd.close();
	}

	public static int fibIteration(int val) {
		int num1 = 0;
		int num2 = 1;
		int num3 = 1;

		for (int i = 0; i < val; i++) {
			num1 = num2;
			num2 = num3;
			num3 = num1 + num2;
		}
		System.out.println(num1);
		return num1;
	}

}
