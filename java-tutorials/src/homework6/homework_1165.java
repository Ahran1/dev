package homework6;

import java.util.Scanner;

public class homework_1165 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int r = scanner.nextInt();
		int s = scanner.nextInt();

		int n = s + (90 - r) / 5;

		if (r % 5 == 0) {
			System.out.println(n);
		} else {
			System.out.println(n + 1);
		}

		scanner.close();
	}

}
