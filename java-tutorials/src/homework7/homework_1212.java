package homework7;

import java.util.Scanner;

public class homework_1212 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		scanner.close();

		if (a == b && b == c) {
			System.out.println("yes");
		} else {
			if (a >= b && a >= c) {
				if (a < b + c) {
					System.out.println("yes");
				} else {
					System.out.println("no");
				}
			}

			if (b >= c && b >= a) {
				if (b < c + a) {
					System.out.println("yes");
				} else {
					System.out.println("no");
				}
			}

			if (c >= a && c >= b) {
				if (c < a + b) {
					System.out.println("yes");
				} else {
					System.out.println("no");
				}
			}

		}

	}
}