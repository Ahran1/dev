package homework15;

import java.util.Scanner;

public class Homework_1096 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		int[][] a = new int[20][20];

		int y, x;
		for (int i = 0; i < n; i++) {
			y = scanner.nextInt();
			x = scanner.nextInt();
			a[y][x] = 1;
		}
		
		scanner.close();
		for (int i = 1; i < 20; i++) {
			for (int j = 1; j < 20; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}

}
