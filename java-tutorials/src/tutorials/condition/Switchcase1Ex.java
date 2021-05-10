package tutorials.condition;

import java.util.Scanner;

public class Switchcase1Ex {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		switch (a) {
		case 0:
			System.out.println("0");
		case 1:
			System.out.println("1");
		case 2:
			System.out.println("2");
		default:
			System.out.println("...");
		}
		scanner.close();
	}

}
