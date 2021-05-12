package homework8;

import java.util.Scanner;

public class homework_1083 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		scanner.close();
		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0) {
				System.out.print("X");
			} else {
				System.out.print(i);
			}
			if (i < n) {
				System.out.print(" ");
			}
		}

	}
}