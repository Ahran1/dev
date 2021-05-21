package homework10;

import java.util.Scanner;

public class homework_1286 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int max = -1000000;
		int min = 1000000;
		for (int i = 1; i <= 5; i++) {
			int input = scanner.nextInt();
			max = (max >= input ? max : input);
			min = (min <= input ? min : input);
		}
		scanner.close();
		System.out.println(max);
		System.out.println(min);
	}
}