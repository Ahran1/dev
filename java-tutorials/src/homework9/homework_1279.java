package homework9;

import java.util.Scanner;

public class homework_1279 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		scanner.close();
		int sum = 0;
		for (int i = a; i <= b; i++) {
			if (i % 2 == 1) {
				sum += i;
			} else {
				sum -= i;
			}
		}
		System.out.println(sum);

	}
}