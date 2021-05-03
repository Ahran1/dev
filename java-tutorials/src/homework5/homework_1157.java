package homework5;

import java.util.Scanner;

public class homework_1157 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		float d = scanner.nextFloat();
		if (50 <= d && d <= 60) {
			System.out.println("win");
		} else {
			System.out.println("lose");
		}
		scanner.close();
	}

}
