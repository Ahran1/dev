package homework20;

import java.util.Scanner;

public class Homework_1552 {

	static double x;

	static double f(double x) {
		return x - (long) x;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		x = scanner.nextDouble();
		scanner.close();

		System.out.printf("%.14f", f(x));

	}

}
