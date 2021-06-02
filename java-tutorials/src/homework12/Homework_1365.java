package homework12;

import java.util.Scanner;

public class Homework_1365 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == 1 || j == 1 || i == n || j == n || i == j || i + j == n + 1) {
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

n=3			n=4				n=5	
ooo			oooo			ooooo
ooo			oooo			oo oo
ooo			oooo			o o o
			oooo			oo oo
							ooooo
11 12 13	11 12 13 14		11 12 13 14 15
21 22 23	21 22 23 24		21 22    24 25
31 32 33 	31 32 33 34		31    33    35
			41 42 43 44		41 42    44 45
							51 52 53 54 55




*/
