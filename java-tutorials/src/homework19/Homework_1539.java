package homework19;

import java.util.Scanner;

public class Homework_1539 {

	static int n;

	static void f(int n) {
		System.out.println(n != 0);
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		scanner.close();
		f(n);

	}

}
