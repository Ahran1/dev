package homework4;

import java.util.Scanner;

public class homework_1045 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		long a = scanner.nextLong();
		long b = scanner.nextLong();
		System.out.printf("%d\n", a + b);
		System.out.printf("%d\n", a - b);
		System.out.printf("%d\n", a * b);
		System.out.printf("%d\n", a / b);
		System.out.printf("%d\n", a % b);
		System.out.printf("%.2f", (float)a / b);

		scanner.close();
		
	}

}
