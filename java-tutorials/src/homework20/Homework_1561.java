package homework20;

import java.util.Scanner;

public class Homework_1561 {

	static int n, m;

	static long max(int n, int m) {
		if (n > m) {
			return n;
		} else {
			return m;
		}
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		m = scanner.nextInt();
		scanner.close();
		System.out.println(max(n, m));

	}

}