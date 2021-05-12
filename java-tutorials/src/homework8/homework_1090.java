package homework8;

import java.util.Scanner;

public class homework_1090 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int a = scanner.nextInt();
		int r = scanner.nextInt();
		int n = scanner.nextInt();
		scanner.close();
		double answer = a * Math.pow(r, n - 1);
		System.out.printf("%.0f", answer);

	}
}