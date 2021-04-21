package homework3;

import java.util.Scanner;

public class homework_1019 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		scanner.useDelimiter("[.\r\n]");
		int y = scanner.nextInt();
		int m  = scanner.nextInt();
		int d = scanner.nextInt();
		System.out.printf("%04d.%02d.%02d", y,m,d);
		scanner.close();
	}

}
