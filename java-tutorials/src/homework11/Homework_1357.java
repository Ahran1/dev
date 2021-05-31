package homework11;

import java.util.Scanner;

public class Homework_1357 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();
		int q = 1;

		for (int i = 1; i <= 2 * n - 1; i++) {
			if (i <= n) {
				for (int j = 1; j <= i; j++) {
					System.out.print("*");
				}
				System.out.println();
			} else {
				for (int k = n - q; k >= 1; k--) {
					System.out.print("*");
				}
				q++;
				System.out.println();
			}
		}

	}

}