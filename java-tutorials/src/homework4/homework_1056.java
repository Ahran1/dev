package homework4;

import java.util.Scanner;

public class homework_1056 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		boolean a = scanner.nextInt() != 0;
		boolean b = scanner.nextInt() != 0;

		System.out.printf("%d", a && !b || !a && b ? 1 : 0);

		scanner.close();
	}

}