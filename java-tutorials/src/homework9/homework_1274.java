package homework9;

import java.util.Scanner;

public class homework_1274 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();

		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				count++;
			}
		}
		
		if (count == 2) {
			System.out.println("prime");
		} else {
			System.out.println("not prime");
		}

	}

}