package homework6;

import java.util.Scanner;

public class homework_1173 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int h = scanner.nextInt();
		int m = scanner.nextInt();
		scanner.close();

		int t = 60 * h + m - 30;
		if (t < 0) {
			t = 60 * 24 + t;
		}
		System.out.printf("%d %d", t / 60, t % 60);

	}
}
