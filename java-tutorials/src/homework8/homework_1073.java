package homework8;

import java.util.Scanner;

public class homework_1073 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int n = 1;
		while (n != 0) {
			n = scanner.nextInt();
			if (n == 0) {
				break;
			}
			System.out.println(n);
		}
		scanner.close();

	}
}