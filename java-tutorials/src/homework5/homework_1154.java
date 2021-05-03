package homework5;

import java.util.Scanner;

public class homework_1154 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int a = scanner.nextInt();
		int b = scanner.nextInt();

		if (a > b) {
			System.out.println(a - b);
		} else if (a < b) {
			System.out.println(b - a);
		} else if (a == b) {
			System.out.println(0);
		}
		scanner.close();
	}

}
