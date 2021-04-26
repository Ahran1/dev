package homework3;

import java.util.Scanner;

public class homework_1027 {

	public static void main(String[] args) {
 
		Scanner scanner = new Scanner(System.in);
		scanner.useDelimiter("[.\r\n]");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		scanner.close();
		System.out.printf("%02d-%02d-%04d", c, b, a);
		
	}

}