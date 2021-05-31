package homework11;

import java.util.Scanner;

public class Homework_1351 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int gugu = scanner.nextInt();
		int gugu2 = scanner.nextInt();
		scanner.close();

		for (int i = gugu; i <= gugu2; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d*%d=%d\n", i, j, i * j);
			}
		}

	}

}