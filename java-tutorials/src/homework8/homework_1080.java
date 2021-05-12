package homework8;

import java.util.Scanner;

public class homework_1080 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		scanner.close();
		int sum = 0;
		int i = 0;
		while (sum < n) {
			sum += i;
			i++;
		}
		System.out.println(i - 1);

	}
}
