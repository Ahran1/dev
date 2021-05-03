package homework5;

import java.util.Scanner;

public class homework_1161 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int a = scanner.nextInt();
		int b = scanner.nextInt();

		if (a % 2 == 0) {
			System.out.print("Â¦¼ö+");
		} else {
			System.out.print("È¦¼ö+");
		}

		if (b % 2 == 0) {
			System.out.print("Â¦¼ö=");
		} else {
			System.out.print("È¦¼ö=");
		}

		if ((a + b) % 2 == 0) {
			System.out.print("Â¦¼ö");
		} else {
			System.out.print("È¦¼ö");
		}

		scanner.close();
	}

}
