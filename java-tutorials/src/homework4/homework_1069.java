package homework4;

import java.util.Scanner;

public class homework_1069 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		char a = scanner.next().charAt(0);

		switch (a) {
		case 65:
			System.out.printf("%s", "best!!!");
			break;
		case 66:
			System.out.printf("%s", "good!!");
			break;
		case 67:
			System.out.printf("%s", "run!");
			break;
		case 68:
			System.out.printf("%s", "slowly~");
			break;
		default:
			System.out.printf("%s", "what?");

		}

		scanner.close();
	}

}