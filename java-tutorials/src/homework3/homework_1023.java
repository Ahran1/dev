package homework3;

import java.util.Scanner;

public class homework_1023 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		scanner.useDelimiter("[.\r\n]");
		int a = scanner.nextInt();
		int b = scanner.nextInt();		
		System.out.printf("%d\n%d", a ,b);
		scanner.close();		
	}
}