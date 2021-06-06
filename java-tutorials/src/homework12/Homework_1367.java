package homework12;

import java.util.Scanner;

public class Homework_1367 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
/*

n = 2		n = 3				n = 4

 oo			   ooo				oooo
oo			  ooo		   	   oooo
			 ooo		  	  oooo
						 	 oooo


°ø¹é
1 0			2 1 0
º° 			
n n			n n n
   
   
*/