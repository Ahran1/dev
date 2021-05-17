package homework9;

import java.util.Scanner;

public class homework_1258 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();
		int i = 1;
		int sum = 0;
		while (i <= n) {
			sum = sum + i;
			i++;
		}
		System.out.println(sum);

	}

}