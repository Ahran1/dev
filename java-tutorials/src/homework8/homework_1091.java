package homework8;

import java.util.Scanner;

public class homework_1091 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int a = scanner.nextInt();
		int m = scanner.nextInt();
		int d = scanner.nextInt();
		int n = scanner.nextInt();
		scanner.close();

		long answer = a;
		for (int i = 1; i < n; i++) {
			answer = answer * m + d;
		}
		System.out.println(answer);

	}
}
