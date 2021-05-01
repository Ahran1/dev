package homework4;

import java.util.Scanner;

public class homework_1058 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int a = scanner.nextInt();
		int b = scanner.nextInt();

		System.out.printf("%d", (a == 0) && (b == 0) ? 1 : 0);

		scanner.close();
	}

}