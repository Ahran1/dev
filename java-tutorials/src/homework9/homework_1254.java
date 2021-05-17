package homework9;

import java.util.Scanner;

public class homework_1254 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		char a = scanner.next().charAt(0);
		char b = scanner.next().charAt(0);
		scanner.close();

		for (int i = a; i <= b; i++) {
			System.out.printf("%c ", i);
		}

	}

}