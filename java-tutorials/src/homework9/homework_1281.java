package homework9;

import java.util.Scanner;

public class homework_1281 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		scanner.close();
		int sum = 0;
		for (int i = a; i <= b; i++) {
			if (i % 2 == 1) {
				sum += i;
				if (i == a) {
					System.out.printf("%d", i);
				} else {
					System.out.printf("+%d", i);
				}
			} else {
				sum -= i;
				System.out.printf("-%d", i);
			}
		}
		System.out.printf("=%d", sum);

	}
}