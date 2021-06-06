package homework12;

import java.util.Scanner;

public class Homework_1369 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int k = scanner.nextInt();
		scanner.close();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				// x+y=mk-1 Á¶°Ç
				if (i == 0 || i == n - 1 || j == 0 || j == n - 1 || (i + j + 1) % k == 0) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
/*
 * 
 * n = 5 k = 2 n = 5 k = 3
 * 
 * ooooo 11 12 13 14 15 11 12 13 14 15 oo oo 21 22 24 25 21 22 25 o o o 31 33 35
 * 31 34 35 oo oo 41 42 44 45 41 43 45 ooooo 51 52 53 54 55 51 52 53 54 55
 * 
 */