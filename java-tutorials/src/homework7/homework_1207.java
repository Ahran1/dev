package homework7;

import java.util.Scanner;

public class homework_1207 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int d = scanner.nextInt();
		scanner.close();
		if (a + b + c + d == 1) {
			System.out.println("µµ");
		} else if (a + b + c + d == 2) {
			System.out.println("°³");
		} else if (a + b + c + d == 3) {
			System.out.println("°É");
		} else if (a + b + c + d == 4) {
			System.out.println("À·");
		} else if (a + b + c + d == 0) {
			System.out.println("¸ð");
		}
	}
}