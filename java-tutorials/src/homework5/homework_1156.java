package homework5;

import java.util.Scanner;

public class homework_1156 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();

		if (n % 2 == 0) {
			System.out.println("even");
		} else {
			System.out.println("odd");
		}
		scanner.close();
	}

}
