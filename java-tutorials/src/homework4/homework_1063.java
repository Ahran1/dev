package homework4;

import java.util.Scanner;

public class homework_1063 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int a = scanner.nextInt();
		int b = scanner.nextInt();

		System.out.printf("%d", a > b ? a : b);

		scanner.close();
	}

}