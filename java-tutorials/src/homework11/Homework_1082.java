package homework11;

import java.util.Scanner;

public class Homework_1082 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt(16);
		scanner.close();

		String decimal = "1";
		int i = Integer.parseInt(decimal, 16);
		for (i = 1; i <= 0XF; i++) {
			int v = n * i;
			System.out.printf("%X*%X=%X\n", n, i, v);
		}

	}

}