package homework4;

import java.util.Scanner;

public class homework_1085 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		long h = scanner.nextInt();
		long b = scanner.nextInt();
		long c = scanner.nextInt();
		long s = scanner.nextInt();

		float a = (float) (h * b * c * s) / 8 / 1024 / 1024;
		System.out.printf("%.1f MB", a);

		scanner.close();
	}
}