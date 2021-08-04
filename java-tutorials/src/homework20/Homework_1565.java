package homework20;

import java.util.Scanner;

public class Homework_1565 {

	static int a, b;

	static int gcd(int p, int q) {
		if (p == 0)
			return q;
		return gcd(q % p, p);
	}

	static long lcm(int a, int b) {
		int g = gcd(a, b);
		a = a / g;
		b = b / g;
		return (long) a * b * g;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		a = scanner.nextInt();
		b = scanner.nextInt();
		scanner.close();
		System.out.printf("%d", lcm(a, b));

	}

}