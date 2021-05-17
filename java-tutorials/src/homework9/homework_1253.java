package homework9;

import java.util.Scanner;

public class homework_1253 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		scanner.close();
		int max = Math.max(a, b);
		int min = Math.min(a, b);
		for (int i = min; i <= max; i++) {
			System.out.printf("%d ", i);
		}

	}

}