package homework13;

import java.util.Scanner;

public class Homework_1370 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int h = scanner.nextInt();
		int r = scanner.nextInt();
		scanner.close();

		for (int i = 0; i < r; i++) {
			for (int j = 0; j < h; j++) {
				for (int k = 0; k < j; k++) {
					System.out.print(" ");
				}
				System.out.println("*");
			}
			for (int j = 0; j < h - 1; j++) {
				for (int k = 0; k < h - 2 - j; k++) {
					System.out.print(" ");
				}
				System.out.println("*");
			}

		}
	}
}