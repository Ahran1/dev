package homework7;

import java.util.Scanner;

public class homework_1230 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		scanner.close();

		if (a <= 170) {
			System.out.println("CRASH " + a);
		} else if (b <= 170) {
			System.out.println("CRASH " + b);
		} else if (c <= 170) {
			System.out.println("CRASH " + c);
		} else {
			System.out.println("PASS");
		}	
		
	}
}