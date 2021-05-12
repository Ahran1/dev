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
		
		long answer = 1;
		if (n == 1) {
			answer = a;
		} else {
			answer = a * m + d;

		}
		for (int i = 2; i <= n - 1; i++) {
			answer = answer * m + d;
		}
		System.out.println(answer);

	}
}
