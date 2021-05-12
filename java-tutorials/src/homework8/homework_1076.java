package homework8;

import java.util.Scanner;

public class homework_1076 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		char input = scanner.next().charAt(0);
		scanner.close();
		int i = 97;
		while (i <= input) {
			System.out.printf("%c", i);
			i++;
			if (i > input) {
				break;
			} else {
				System.out.print(" ");
			}
		}

	}
}