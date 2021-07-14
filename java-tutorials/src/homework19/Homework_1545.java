package homework19;

import java.util.Scanner;

public class Homework_1545 {

	static int n;

	static boolean zero(int n) {
		return n == 0;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		scanner.close();

		if (zero(n)) {
			System.out.println("zero");
		} else {
			System.out.println("non zero");
		}
	}

}