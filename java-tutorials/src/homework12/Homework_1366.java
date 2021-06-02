package homework12;

import java.util.Scanner;

public class Homework_1366 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == 1 || j == 1 || i == n || j == n || i == (n + 1) / 2 || j == (n + 1) / 2 || i == j
						|| i + j == n + 1) {
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

n=3					n=5					n = 7
ooo					ooooo				ooooooo
ooo					oo oo 				oo   oo
ooo					o o o				o o o o
					oo oo				o  o  o
					ooooo				o o o o
11 12 13			11 12 13 14 15 	    oo	 oo
21 22 23			21 22    24 25		ooooooo
31 32 33 			31    33    35
					41 42    44 45		11 12 13 14 15 16 17
					51 52 53 54 55		21 22 	 24	   26 27
										31    33 34 35    37
									    41 42 43 44 45 46 47
										51    53 54 55    57
									 	61 62	 64	   66 67
										71 72 73 74 75 76 77
*
*/
