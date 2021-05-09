package homework7;

import java.util.Scanner;

public class homework_1218 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		scanner.close();
		int as = (int) Math.pow(a, 2);
		int bs = (int) Math.pow(b, 2);
		int cs = (int) Math.pow(c, 2);

		if (a + b > c) {
			if (a == b && b == c) {
				System.out.println("Á¤»ï°¢Çü");
			} else if (a == b || b == c) {
				System.out.println("ÀÌµîº¯»ï°¢Çü");
			} else if (as + bs == cs) {
				System.out.println("Á÷°¢»ï°¢Çü");
			} else {
				System.out.println("»ï°¢Çü");
			}

		} else {
			System.out.println("»ï°¢Çü¾Æ´Ô");
		}	
		
	}
}