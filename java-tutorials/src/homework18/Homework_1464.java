package homework18;

import java.util.Scanner;

public class Homework_1464 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		scanner.close();
		int[][] a = new int[n + 1][m + 1];

		int cnt = 1;
		for (int i = n; i >= 1; i--) {
			for (int j = m; j >= 1; j--) {
				a[i][j] = cnt;
				cnt++;
			}
		}

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

	}

}
