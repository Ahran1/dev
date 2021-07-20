package homework19;

import java.util.Scanner;

public class Homework_1543 {
	static int n;

	static void f(int n) {
		for (int i = 0; i < n; i++) {
			System.out.println("love");
		}
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		scanner.close();
		f(n);
	}

}
