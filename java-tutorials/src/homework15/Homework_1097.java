package homework15;

import java.util.Scanner;

public class Homework_1097 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[][] arr = new int[20][20];
		for (int i = 1; i < 20; i++) {
			for (int j = 1; j < 20; j++) {
				arr[i][j] = scanner.nextInt();
			}
		}

		int n = scanner.nextInt();

		for (int i = 0; i < n; i++) {
			int x = scanner.nextInt();
			int y = scanner.nextInt();
			for (int j = 1; j < 20; j++) {
				for (int k = 1; k < 20; k++) {
					if(arr[j][y]==0) {
						arr[j][y] = 1;
					} else {
						arr[j][y] = 0;
					}
					if(arr[x][k]==0) {
						arr[x][k] = 1;
					} else {
						arr[x][k] = 0;
					}
									
				
				}
			}
		}

		for (int i = 1; i < 20; i++) {
			for (int j = 1; j < 20; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

		scanner.close();
	}

}
