package homework15;

import java.util.Scanner;

public class Homework_1097 {

	public static void main(String[] args) {
		int[][] board = new int[20][20];
		int n, x, y;

		Scanner scanner = new Scanner(System.in);
		for (int i = 1; i < 20; i++) {
			for (int j = 1; j < 20; j++) {
				board[i][j] = scanner.nextInt();
			}
		}

		n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			y = scanner.nextInt();
			x = scanner.nextInt();
			for (int j = 1; j < 20; j++) {
				board[y][j] = 1 - board[y][j];
			}

			for (int j = 1; j < 20; j++) {
				board[j][x] = 1 - board[j][x];
			}
		}

		for (int i = 1; i < 20; i++) {
			for (int j = 1; j < 20; j++) {
				System.out.printf("%d ", board[i][j]);
			}
			System.out.println();
		}
		scanner.close();
	}
}
