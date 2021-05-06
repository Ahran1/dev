package homework6;

import java.util.Scanner;

public class homework_1167 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		scanner.close();

		if (a <= b && b <= c || c <= b && b <= a) {
			System.out.println(b);
		} else if (a <= c && c <= b || b <= c && c <= a) {
			System.out.println(c);
		} else {
			System.out.println(a);
		}

	}

}
