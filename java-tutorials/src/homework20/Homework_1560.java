package homework20;

import java.util.Scanner;

public class Homework_1560 {

	static long n, m;

	static long f(long n, long m) {
		if (n > m) {
			return n - m;
		} else {

			return m - n;
		}

	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		n = scanner.nextLong();
		m = scanner.nextLong();
		scanner.close();
		System.out.println(f(n, m));

	}

}