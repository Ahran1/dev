package homework9;

import java.util.Scanner;

public class homework_1284 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();
		int a = 0;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				a = i;
				break;
			}
		}
		for (int i = 2; a != 0 && i < n / a; i++) {
			if (n / a % i == 0) {
				a = 0;
				break;
			}
		}
		if (a == 0) {
			System.out.println("wrong number");
		} else {
			System.out.printf("%d %d", a, n / a);
		}

	}

}