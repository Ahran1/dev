package homework8;

import java.util.Scanner;

public class homework_1079 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		char c = 'a';
		while (c != 'q') {
			c = scanner.next().charAt(0);
			System.out.println(c);
		}
		scanner.close();
	}

}