package homework20;

import java.util.Scanner;

public class Homework_1558 {

	static long n;

	static long f(long n) {
		int[] reverse = new int[19];
		int idx = 0;

		while (n != 0) {
			reverse[idx] = (int) (n % 10);
			n = n / 10;
			idx++;
		}

		long result = 0;
		for (int i = 1; i <= idx; i++) {
			result += reverse[i - 1] * (long) Math.pow(10, idx - i);
		}

		return result;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextLong();
		scanner.close();

		System.out.printf("%d\n", f(n));
	}
}