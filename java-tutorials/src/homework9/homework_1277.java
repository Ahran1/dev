package homework9;

import java.util.Scanner;

public class homework_1277 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();

		for (int i = 1; i <= N; i++) {
			int data = scanner.nextInt();
			if (N == 1) {
				System.out.printf("%d %d %d", data, data, data);
			} else if (i == 1) {
				System.out.print(data + " ");
			} else if (i == (N / 2) + 1) {
				System.out.print(data + " ");
			} else if (i == N) {
				System.out.println(data);
			}
		}
		scanner.close();

	}
}
