package homework9;

import java.util.Scanner;

public class homework_1276 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();
		int i = n;
		int value = 1;
		while (i >= 1) {
			value *= i;
			i--;
		}
		System.out.println(value);

	}
}