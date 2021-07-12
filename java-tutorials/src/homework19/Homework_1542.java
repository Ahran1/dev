package homework19;

import java.util.Scanner;

public class Homework_1542 {

	static int n;

	static void f(int n) {
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				System.out.println("composite");
				return;
			}
		}
		System.out.println("prime");
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		scanner.close();
		f(n);

	}

}
