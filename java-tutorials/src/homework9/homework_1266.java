package homework9;

import java.util.Scanner;

public class homework_1266 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			int a = scanner.nextInt();
			sum = sum + a;
		}
		System.out.println(sum);

	}

}