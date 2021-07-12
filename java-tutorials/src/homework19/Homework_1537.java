package homework19;

import java.util.Scanner;

public class Homework_1537 {

	static int n;

	static void f(int a) {
		if (a == 1) {
			System.out.println("hello");
		} else if (a == 2) {
			System.out.println("world");
		}
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		scanner.close();
		f(n);

	}

}
