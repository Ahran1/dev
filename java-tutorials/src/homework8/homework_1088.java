package homework8;

import java.util.Scanner;

public class homework_1088 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		scanner.close();

		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0) {
				continue;
			}
			System.out.print(i + " ");
		}

	}
}
