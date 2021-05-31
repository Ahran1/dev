package homework10;

import java.util.Scanner;

public class Homework_1287 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();

		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= n * i; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
}