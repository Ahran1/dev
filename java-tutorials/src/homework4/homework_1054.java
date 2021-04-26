package homework4;

import java.util.Scanner;

public class homework_1054 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		boolean a = scanner.hasNextInt();
		boolean b = scanner.hasNextInt();

		System.out.printf("%d", a && b);
		scanner.close();

	}

}
