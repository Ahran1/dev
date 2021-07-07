package homework18;

import java.util.Scanner;

public class Homework_1471 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();

		int[][] a = new int[n][n];
		int num = 1;
		int s = 0, e = n, d = 1;
		for (int j = 0; j < n; j++) {
			s = n - 1 - s;
			e = n - 1 - e;
			d = -1 * d;
			for (int i = s; i != e; i = i + d) {
				a[i][j] = num;
				num++;
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
