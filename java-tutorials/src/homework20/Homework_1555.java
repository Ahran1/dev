package homework20;

import java.util.Scanner;

public class Homework_1555 {

	static int n;

	static long f(int n) {
		long sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		return sum;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		scanner.close();

		System.out.printf("%d", (f(n)));

	}

}