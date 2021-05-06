package homework6;

import java.util.Scanner;

public class homework_1172 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();

		if (a <= b && b <= c) {
			System.out.printf("%d %d %d", a, b, c);
		} else if (a <= c && c <= b) {
			System.out.printf("%d %d %d", a, c, b);
		} else if (b <= c && c <= a) {
			System.out.printf("%d %d %d", b, c, a);
		} else if (b <= a && a <= c) {
			System.out.printf("%d %d %d", b, a, c);
		} else if (c <= a && a <= b) {
			System.out.printf("%d %d %d", c, a, b);
		} else if (c <= b && b <= a) {
			System.out.printf("%d %d %d", c, b, a);

		}

		scanner.close();
	}
}
