package homework5;

import java.util.Scanner;

public class homework_1159 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int d = scanner.nextInt();
		if (50 <= d && d <= 70 || d % 6 == 0) {
			System.out.println("win");
		} else {
			System.out.println("lose");
		}
		scanner.close();
	}

}
