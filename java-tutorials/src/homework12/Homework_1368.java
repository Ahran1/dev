package homework12;

import java.util.Scanner;

public class Homework_1368 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int h = scanner.nextInt();
		int k = scanner.nextInt();
		char d = scanner.next().charAt(0);
		scanner.close();

		if (d == 'R') {
			for (int i = 1; i <= h; i++) {
				for (int j = 1; j <= h - i; j++) {
					System.out.print(" ");
				}
				for (int j = 1; j <= k; j++) {
					System.out.print("*");
				}
				System.out.println();
			}

		} else {
			for (int i = 1; i <= h; i++) {
				for (int j = 1; j <= i - 1; j++) {
					System.out.print(" ");
				}
				for (int j = 1; j <= k; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}

	}

}

/*

h = 5   k = 4   d = R		h = 5  k = 4  d = L
			공백							공백	
 	oooo	4				 oooo		0
   oooo		3				  oooo		1
  oooo		2 			   	   oooo		2
 oooo		1				    oooo   	3
oooo		0					 oooo	4

공백 = h - i					공백 = i - 1 
* = k개						
            15 16 17 18        11 12 13 14					j =	i+k-1
		 24 25 26 27			  22 23 24 25				
	  33 34 35 36 					 33 34 35 36
   42 43 44 45							44 45 46 47
51 52 53 54								   55 56 57 58
  j = h-i 개 공백 

*/