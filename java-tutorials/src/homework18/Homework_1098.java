package homework18;

import java.util.Scanner;

public class Homework_1098 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int w = scanner.nextInt();
		int h = scanner.nextInt();
		int n = scanner.nextInt();
		int l, d, x, y;
		int[] dy = { 1, 0 };
		int[] dx = { 0, 1 };
		int[][] arr = new int[101][101];

		for (int i = 0; i < n; i++) {
			l = scanner.nextInt();
			d = scanner.nextInt();
			x = scanner.nextInt();
			y = scanner.nextInt();

			for (int j = 0; j < l; j++) {
				arr[x + dx[d] * j][y + dy[d] * j] = 1;
			}
		}

		for (int i = 1; i <= w; i++) {
			for (int j = 1; j <= h; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}