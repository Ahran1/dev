package homework9;

import java.util.Scanner;

public class homework_1284 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();
		int i = 2;
		int prime1 = 3, prime2 = 3;
		int count = 0;

		while (i <= n) {
			if (n % i == 0) {
				for (int a = 1; a <= i; a++) {
					if (i % a == 0) {
						count++;
					}
				}
				if (count == 2) {
					prime1 = i;
					break;
				}

			}
			i++;
		}
		i = prime1 + 1;
		while (i <= n) {
			if (n % i == 0) {
				for (int a = 1; a <= i; a++) {
					if (i % a == 0) {
						count++;
					}
				}
				if (count == 4) {
					prime2 = i;
				}

			}
			i++;
		}

		if (prime1 * prime2 == n) {
			System.out.println(prime1 + " " + prime2);
		} else {
			System.out.println("wrong number");
		}

	}

}
