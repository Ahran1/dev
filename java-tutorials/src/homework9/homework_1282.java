package homework9;

import java.util.Scanner;

public class homework_1282 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();

		int t = 1, k = 0;
		double i = n;

		for (i = n; i >= 1; i--) {
			double sqr = Math.sqrt(i);
			if (Math.round(sqr) == sqr) {
				t = (int) sqr;
				break;
			}
			k++;
		}
		System.out.printf("%d %d", k, t);

	}

}
