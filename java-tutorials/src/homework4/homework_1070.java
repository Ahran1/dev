package homework4;

import java.util.Scanner;

public class homework_1070 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int month = scanner.nextInt();

		switch (month) {
		case 12:
		case 1:
		case 2:
			System.out.printf("%s", "winter");
			break;
		case 3:
		case 4:
		case 5:
			System.out.printf("%s", "spring");
			break;
		case 6:
		case 7:
		case 8:
			System.out.printf("%s", "summer");
			break;
		case 9:
		case 10:
		case 11:
			System.out.printf("%s", "fall");
			break;
		}

		scanner.close();
	}

}