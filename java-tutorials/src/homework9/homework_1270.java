package homework9;

import java.util.Scanner;

public class homework_1270 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();
		int i = 1;
		int count = 0;
		while (i <= n) {
			if (i % 10 == 1) {
				count += 1;
			}
			i++;
		}
		System.out.println(count);

	}

}