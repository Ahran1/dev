package homework9;

import java.util.Scanner;

public class homework_1255 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		scanner.close();

		for (double i = a; i <= b; i += 0.01) {
			System.out.printf("%.2f ", i);
		}

	}

}
