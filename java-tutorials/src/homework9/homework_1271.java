package homework9;

import java.util.Scanner;

public class homework_1271 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int max = 0;
		for (int i = 1; i <= n; i++) {
			int input = scanner.nextInt();
			max = max >= input ? max : input;
		}
		scanner.close();
		System.out.println(max);
	}
}