package homework14;

import java.util.Scanner;

public class Homework_1410 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		char[] ch = new char[str.length()];
		scanner.close();

		for (int i = 0; i < str.length(); i++) {
			ch[i] = str.charAt(i);
		}
		int open = 0;
		int closed = 0;

		for (int i = 0; i < str.length(); i++) {
			if (ch[i] == '(') {
				open++;
			} else {
				closed++;
			}
		}
		System.out.printf("%d %d", open, closed);

	}

}
