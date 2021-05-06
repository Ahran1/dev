package homework6;

import java.util.Scanner;

public class homework_1170 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();

		System.out.printf("%d%d%02d", a, b, c);

		scanner.close();
	}

}
