package homework7;

import java.util.Scanner;

public class homework_1205 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		scanner.close();

		double max = a + b;
		if (a - b > max) {
			max = a - b;
		}
		if (b - a > max) {
			max = b - a;
		}
		if (a * b > max) {
			max = a * b;
		}
		if (a / b > max) {
			max = a / b;
		}
		if (b / a > max) {
			max = b / a;
		}
		if (Math.pow(a, b) > max) {
			max = Math.pow(a, b);
		}
		if (Math.pow(b, a) > max) {
			max = Math.pow(b, a);
		}
		System.out.printf("%.6f", max);

	}
}