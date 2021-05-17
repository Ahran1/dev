package homework9;

import java.util.Scanner;

public class homework_1261 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = 0;
		for (int i = 1; i <= 10; i++) {
			n = scanner.nextInt();
			if (n % 5 == 0) {
				System.out.println(n);
				break;
			}

		}
		System.out.println(0);

		scanner.close();

	}
}