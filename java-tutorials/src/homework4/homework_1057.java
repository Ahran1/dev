package homework4;

import java.util.Scanner;

public class homework_1057 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		System.out.printf("%d", a == b ? 1 : 0);
		
		scanner.close();
	}

}