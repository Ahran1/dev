package homework20;

import java.util.Scanner;

public class Homework_1567 {

	static int n, a, b, d[] = new int[1010];

	static long subsetsum(int a, int b) {

		long sum = 0;
		for (int i = a; i < b + 1; i++) {
			sum += d[i];
		}

		return sum;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();

		for (int i = 1; i < n + 1; i++) {
			d[i] = scanner.nextInt();
		}
		a = scanner.nextInt();
		b = scanner.nextInt();
		scanner.close();
		System.out.println(subsetsum(a, b));

	}

}
