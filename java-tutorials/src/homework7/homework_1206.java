package homework7;

import java.util.Scanner;

public class homework_1206 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		scanner.close();
		int x;
		if (b % a == 0) {
			x = b / a;
			System.out.printf("%d*%d=%d", a, x, b);
		} else if (a % b == 0) {
			x = a / b;
			System.out.printf("%d*%d=%d", b, x, a);
		} else {
			System.out.println("none");
		}
		
	}
}