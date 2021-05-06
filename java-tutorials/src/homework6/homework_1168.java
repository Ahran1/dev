package homework6;

import java.util.Scanner;

public class homework_1168 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int b = scanner.nextInt();
		int g = scanner.nextInt();
		scanner.close();

		if (g == 1 || g == 2) {
			System.out.println(113 - b / 10000);
		} else {
			System.out.println(13 - b / 10000);
		}

	}

}
