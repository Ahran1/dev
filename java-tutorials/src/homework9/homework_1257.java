package homework9;

import java.util.Scanner;

public class homework_1257 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		scanner.close();
		int n = a;
		while (n <= b) {
			if (n % 2 == 1) {
				System.out.printf("%d ", n);
			}
			n++;
		}

	}

}
