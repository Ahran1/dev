package homework13;

import java.util.Scanner;

public class Homework_1380 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int k = scanner.nextInt();
		scanner.close();

		for (int i = 1; i < 7; i++) {
			for (int j = 1; j < 7; j++) {
				if (i + j == k) {
					System.out.printf("%d %d", i, j);
					System.out.println();
				}
			}
		}

	}

}
