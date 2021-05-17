package homework9;

import java.util.Scanner;

public class homework_1265 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int dan = scanner.nextInt();
		scanner.close();
		int n = 1;
		for (n = 1; n <= 9; n++) {
			int answer = dan * n;
			System.out.printf("%d*%d=%d\n", dan, n, answer);
		}
	}
}