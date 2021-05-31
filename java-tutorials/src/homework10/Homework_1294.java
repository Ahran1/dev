package homework10;

import java.util.Scanner;

public class Homework_1294 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c >= 120) {
				System.out.print((char) (c - 23));
			} else if (c == ' ') {
				System.out.print(' ');
			} else {
				System.out.print((char) (c + 3));
			}
		}
		scanner.close();
	}
}