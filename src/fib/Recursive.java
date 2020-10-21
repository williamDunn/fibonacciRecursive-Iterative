package fib;

import java.util.Scanner;

public class Recursive {

	public static void main(String[] args) {

		System.out.println("r");
		System.out.println("Enter an integer value");

		Scanner kbd = new Scanner(System.in);

		int val = kbd.nextInt();

		System.out.println("");

		long start = System.currentTimeMillis();

		fibRecursion(val);

		long end = System.currentTimeMillis();

		System.out.println("time: " + (end - start));
		
		kbd.close();
	}

	public static int fibRecursion(int val) {
		int num = 0;
		if (val == 1 || val == 2) {
			return 1;
		} else
			num = ((val - 1) + (val - 2));
		System.out.println(num);
			return fibRecursion(val - 1) + fibRecursion(val - 2);
	}
}
