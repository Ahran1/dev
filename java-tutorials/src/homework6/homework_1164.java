package homework6;

import java.util.Scanner;

public class homework_1164 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		if (a <= 170 || b <= 170 || c <= 170) {
			System.out.println("CRASH");
		} else {
			System.out.println("PASS");
		}

		scanner.close();
	}

}
