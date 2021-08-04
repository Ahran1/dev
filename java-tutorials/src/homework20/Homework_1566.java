package homework20;

import java.util.Scanner;

public class Homework_1566 {

	public static long pow(int a, int n) {
		long result = 1;
		for (int i = 0; i < n; i++) {
			result *= a;
		}
		return result;
	}

	public static void main(String[] args) {
		int a, n;

		Scanner scanner = new Scanner(System.in);
		a = scanner.nextInt();
		n = scanner.nextInt();
		System.out.printf("%d\n", pow(a, n));
		scanner.close();
	}
}