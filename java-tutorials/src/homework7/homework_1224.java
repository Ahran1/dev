package homework7;

import java.util.Scanner;

public class homework_1224 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int d = scanner.nextInt();
		scanner.close();

		double ab = (double) a / b;
		double cd = (double) c / d;
		if (ab > cd) {
			System.out.println(">");
		} else if (ab == cd) {
			System.out.println("=");
		} else {
			System.out.println("<");
		}	
		
	}
}