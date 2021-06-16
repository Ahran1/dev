package homework14;

import java.util.Scanner;

public class Homework_1095 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		int[] arr = new int[n];
		int min = 23;
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}
		for (int i = 0; i < n; i++) {
			if (arr[i] <= min) {
				min = arr[i];
			}
		}
		scanner.close();
		System.out.println(min);

	}

}