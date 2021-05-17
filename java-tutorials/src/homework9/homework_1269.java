package homework9;

import java.util.Scanner;

public class homework_1269 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int n = scanner.nextInt();
		scanner.close();
		int value = a;
		for (int i = 1; i < n; i++) {
			value = value * b + c;
		}
		System.out.println(value);

	}

}
