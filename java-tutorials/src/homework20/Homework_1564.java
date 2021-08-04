package homework20;

import java.util.Scanner;

public class Homework_1564 {

	static int a, b;

	static int gcd(int a, int b) {
		int max = 1;
		for (int cd = 1; cd <= a && cd <= b; cd++) {
			if (a % cd == 0 && b % cd == 0) {
				max = cd;
			}
		}

		return max;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		a = scanner.nextInt();
		b = scanner.nextInt();
		scanner.close();
		System.out.println(gcd(a, b));

	}

}