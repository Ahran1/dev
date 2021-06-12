package homework13;

import java.util.Scanner;

public class Homework_1371 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();

		for (int i = 1; i <= n * 2; i++) {
			for (int j = 1; j <= n * 2; j++) {
				if (i + j == n + 1 || j - i == n || i + j == n * 3 + 1 || i - j == n) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
