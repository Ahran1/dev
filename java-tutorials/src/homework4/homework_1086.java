package homework4;

import java.util.Scanner;

public class homework_1086 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		long w = scanner.nextInt();
		long h = scanner.nextInt();
		long b = scanner.nextInt();

		float a = (float) (w * h * b) / 8 / 1024 / 1024;
		System.out.printf("%.2f MB", a);

		scanner.close();
	}

}