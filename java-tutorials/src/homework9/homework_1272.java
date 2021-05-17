package homework9;

import java.util.Scanner;

public class homework_1272 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int k = scanner.nextInt();
		int h = scanner.nextInt();
		scanner.close();
		int sum = 0, num;

		for (int i = 1; i <= k || i <= h; i++) {
			if (i % 2 == 1) {
				num = i / 2 + 1;
			} else {
				num = i / 2 * 10;
			}
			if (i == k || i == h) {
				sum += num;
			}
		}
		System.out.println(sum);
	}

}