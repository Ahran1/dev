package homework4;

import java.util.Scanner;

public class homework_1065 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();

		if (a % 2 == 0) {
			System.out.printf("%d\n", a);
		}
		if (b % 2 == 0) {
			System.out.printf("%d\n", b);
		}
		if (c % 2 == 0) {
			System.out.printf("%d", c);
		}

		scanner.close();
	}

}