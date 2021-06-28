package homework16;

import java.util.Scanner;

public class Homework_1099 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int[][] arr = new int[11][11];

		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				arr[i][j] = scanner.nextInt();
			}
		}

		int k = 2;
		int flag = 0;
		for (int i = 2; i <= 10; i++) {
			int j = k;
			for (; j <= 10; j++) {

				if (arr[i][j] == 0) {
					arr[i][j] = 9;
				} else if (arr[i][j] == 2) {
					arr[i][j] = 9;
					flag = 1;
					break;
				} else {
					k = j - 1;
					break;
				}
			}
			if (flag == 1) {
				break;
			}
		}

		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

}