package homework7;

import java.util.Scanner;

public class homework_1212 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		scanner.close();

		int max = a > b ? (a > c ? a : c) : (b > c ? b : c);
		if (max < a + b + c - max) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}

	}
}