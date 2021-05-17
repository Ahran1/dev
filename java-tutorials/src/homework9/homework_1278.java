package homework9;

import java.util.Scanner;

public class homework_1278 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();

		int count = 0;
		while (n > 0) {
			n = n / 10;
			count++;
		}
		System.out.println(count);
	}
}