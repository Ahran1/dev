package homework18;

import java.util.Scanner;

public class Homework_1461 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();

		int[][] a = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = n * i + j;
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = n - 1; j >= 0; j--) {
				System.out.print(a[i][j] + 1 + " ");
			}
			System.out.println();
		}

	}

}
