package homework6;

import java.util.Scanner;

public class homework_1201 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		scanner.close();

		if (n > 0) {
			System.out.println("양수");
		} else if (n < 0) {
			System.out.println("음수");
		} else if (n == 0) {
			System.out.println("0");
		}

	}
}
