package homework9;

import java.util.Scanner;

public class homework_1268 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int count = 0;
		for (int i = 1; i <= n; i++) {
			int a = scanner.nextInt();
			if (a % 2 == 0) {
				count += 1;
			}
		}
		System.out.println(count);

	}

}
