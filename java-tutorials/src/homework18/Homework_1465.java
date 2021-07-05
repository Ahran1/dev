package homework18;

import java.util.Scanner;

public class Homework_1465 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();

		scanner.close();

		int[][] a = new int[n][m];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				a[i][j] = m * i + j;
			}
		}
		for (int i = n - 1; i >= 0; i--) {
			for (int j = 0; j < m; j++) {
				System.out.print(a[i][j] + 1 + " ");
			}
			System.out.println();
		}

	}
}
