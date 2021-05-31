package homework10;

import java.util.Scanner;

public class Homework_1295 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String sentence = scanner.next();
		scanner.close();

		for (int i = 0; i < sentence.length(); i++) {
			char ch = sentence.charAt(i);
			if (ch <= 90 && ch >= 65) {
				System.out.printf("%c", (int) ch + 32);
			} else if (ch >= 97 && ch <= 122) {
				System.out.printf("%c", (int) ch - 32);
			} else {
				System.out.printf("%c", ch);
			}
		}
	}
}