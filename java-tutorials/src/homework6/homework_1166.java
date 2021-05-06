package homework6;

import java.util.Scanner;

public class homework_1166 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int r = scanner.nextInt();

		if (r % 4 == 0 && r % 100 != 0 || r % 400 == 0) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}

		scanner.close();
	}

}
