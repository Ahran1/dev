package homework14;

import java.util.Scanner;

public class Homework_1094 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}
		scanner.close();

		for (int i = n - 1; i > -1; i--) {
			System.out.print(arr[i] + " ");
		}
	}
}