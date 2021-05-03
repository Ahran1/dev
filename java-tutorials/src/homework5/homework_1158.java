package homework5;

import java.util.Scanner;

public class homework_1158 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int d = scanner.nextInt();
		if ((30 <= d && d <= 40) || (60 <= d && d <= 70)) {
			System.out.println("win");
		} else {
			System.out.println("lose");
		}
		scanner.close();
	}

}
