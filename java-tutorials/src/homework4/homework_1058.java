package homework4;

import java.util.Scanner;

public class homework_1058 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		boolean a = scanner.nextInt() == 1;
		boolean b = scanner.nextInt() == 1;

		System.out.printf("%d", !a && !b ? 1 : 0);

		scanner.close();
	}

}