package homework3;

import java.util.Scanner;

public class homework_1025 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		scanner.useDelimiter("");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int d = scanner.nextInt();
		int e = scanner.nextInt();
		scanner.close();

		System.out.printf("[%d]\n", a * 10000);
		System.out.printf("[%d]\n", b * 1000);
		System.out.printf("[%d]\n", c * 100);
		System.out.printf("[%d]\n", d * 10);
		System.out.printf("[%d]\n", e);

	}

}