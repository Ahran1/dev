package homework20;

import java.util.Scanner;

public class Homework_1553 {

	static double x;

	static int f(double x) {
		if (x < 0) {
			return (int) x - 1;
		}
		return (int) x;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		x = scanner.nextDouble();
		scanner.close();

		System.out.printf("%d", f(x));

	}

}