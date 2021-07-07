package homework18;

import java.util.Scanner;

public class Homework_1463 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();

		int[][] a = new int[n][n];

		int cnt = 1;
		for (int i = 0; i < n; i++) {
			for (int j = n - 1; j >= 0; j--) {
				a[j][i] = cnt;
				cnt++;
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

	}

}
