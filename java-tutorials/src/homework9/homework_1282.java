package homework9;

import java.util.Scanner;

public class homework_1282 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();

		int t = 1;
		while (t * t < n) {
			t++;
		}
		t--;
		System.out.printf("%d %d", n - t * t, t);
	}

}
