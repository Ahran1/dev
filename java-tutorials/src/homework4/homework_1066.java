package homework4;

import java.util.Scanner;

public class homework_1066 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();

		if (a % 2 == 0) {
			System.out.printf("%s\n", "even");
		} else {
			System.out.printf("%s\n", "odd");
		}

		if (b % 2 == 0) {
			System.out.printf("%s\n", "even");
		} else {
			System.out.printf("%s\n", "odd");
		}

		if (c % 2 == 0) {
			System.out.printf("%s\n", "even");
		} else {
			System.out.printf("%s\n", "odd");
		}

		scanner.close();
	}

}