package homework5;

import java.util.Scanner;

public class homework_1152 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		scanner.close();
		if (n < 10) {
			System.out.println("small");
		} else if (n >= 10) {
			System.out.println("big");
		}

	}

}
