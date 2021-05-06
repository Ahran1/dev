package homework6;

import java.util.Scanner;

public class homework_1169 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int age = scanner.nextInt();
		int b = 0;
		int g = 0;
		if (2012 - age + 1 >= 2000) {
			b = 12 - age + 1;
			g = 3;
		} else {
			b = 112 - age + 1;
			g = 1;
		}
		scanner.close();
		
		System.out.printf("%d %d", b, g);

	}

}
