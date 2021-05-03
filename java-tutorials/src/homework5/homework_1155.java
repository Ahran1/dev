package homework5;

import java.util.Scanner;

public class homework_1155 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();

		if (n % 7 == 0) {
			System.out.println("multiple");
		} else {
			System.out.println("not multiple");
		}
		scanner.close();
	}

}
