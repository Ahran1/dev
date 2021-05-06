package homework6;

import java.util.Scanner;

public class homework_1180 {

	public static void main(String[] args) {

		
		Scanner scanner = new Scanner(System.in);

		int a = scanner.nextInt();
		scanner.close();
		int b = a / 10;
		int c = a % 10;

		int n = (c * 10 + b) * 2;
		if (n >= 100) {
			n = n - 100;
		}

		System.out.println(n);
		if (n <= 50) {
			System.out.println("GOOD");
		} else {
			System.out.println("OH MY GOD");
		}

	}
}
