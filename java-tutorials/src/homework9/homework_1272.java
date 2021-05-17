package homework9;

import java.util.Scanner;

public class homework_1272 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int k = scanner.nextInt();
		int h = scanner.nextInt();
		scanner.close();
		int c1 = 0;
		int c2 = 0;

		for (int i = 1; i <= k; i++) {
			if (i % 2 == 1) {
				c1 = i / 2 + 1;
			} else {
				c1 = i / 2 * 10;
			}
		}
		for (int i = 1; i <= h; i++) {
			if (i % 2 == 1) {
				c2 = i / 2 + 1;
			} else {
				c2 = i / 2 * 10;
			}
		}

		System.out.println(c1 + c2);
	}

}