package homework16;

import java.util.Scanner;

public class Homework_1098 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int[][] a = new int[10][10];
		int[] dx = { 1, 0 };
		int[] dy = { 0, 1 };
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				a[i][j] = scanner.nextInt();
			}
		}
		scanner.close();

		int x = 1, y = 1, nx = 1, ny = 1;
		while (a[y][x] != 2 && x == nx && y == ny) {
			a[y][x] = 9;
			for (int i = 0; i < 2; i++) {
				nx = x + dx[i];
				ny = y + dy[i];
				if (a[ny][nx] != 1) {
					x = nx;
					y = ny;
					break;
				}
			}
		}
		a[y][x] = 9;

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.printf("%d ", a[i][j]);
			}
			System.out.println();
		}
	}
}