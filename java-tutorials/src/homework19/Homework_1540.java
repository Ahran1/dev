package homework19;

import java.util.Scanner;

public class Homework_1540 {

	static int n;

	static void f(int n) {
		if (n == 0) {
			System.out.println("zero");
		} else {
			System.out.println("non zero");
		}
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		scanner.close();
		f(n);

	}

}
