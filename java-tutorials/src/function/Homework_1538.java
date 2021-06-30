package function;

import java.util.Scanner;

public class Homework_1538 {

	static int n;

	static void f(int n) {
		if (n % 2 == 0) {
			System.out.println("even");
		} else {
			System.out.println("odd");
		}
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();
		f(n);
	}

}
