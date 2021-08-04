package homework20;

import java.util.Scanner;

public class Homework_1556 {

	static int n;

	static long f(int n) {
		long mul = 1;
		for (int i = 1; i <= n; i++) {
			mul *= i;
		}
		return mul;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		scanner.close();

		System.out.printf("%d", (f(n)));

	}

}