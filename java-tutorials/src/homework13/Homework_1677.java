package homework13;

import java.util.Scanner;

public class Homework_1677 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		scanner.close();

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (i == 0 || i == m - 1 || j == 0 || j == n - 1) {
					if (i == 0 || i == m - 1) {
						if (j == 0 || j == n - 1) {
							System.out.print("+");
						} else {
							System.out.print("-");
						}
					} else {
						System.out.print("|");
					}
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}