package homework14;

import java.util.Scanner;

public class Homework_1411 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = i + 1;
		}

		for (int i = 0; i < n - 1; i++) {
			int input = scanner.nextInt();
			for (int j = 0; j < n; j++) {
				if (arr[j] == input) {
					arr[j] *= 0;
				}
			}
		}

		int i = 0;
		while (arr[i] == 0) {
			i++;
		}
		System.out.println(arr[i]);

	}

}