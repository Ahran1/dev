package homework20;

import java.util.Scanner;

public class Homework_1559 {

	static int n, m;

	static long f(int n, int m) {
		return (long) n + m;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		m = scanner.nextInt();
		scanner.close();
		System.out.println(f(n, m));

	}

}