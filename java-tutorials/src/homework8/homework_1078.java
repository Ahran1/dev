package homework8;

import java.util.Scanner;

public class homework_1078 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		scanner.close();
		int sum = 0;

		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);

	}
}
