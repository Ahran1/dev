package homework14;

import java.util.Scanner;

public class Homework_1403 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int k = scanner.nextInt();
		int[] arr = new int[k];

		for (int i = 0; i < k; i++) {
			arr[i] = scanner.nextInt();
		}
		scanner.close();

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < k; j++) {
				System.out.println(arr[j]);
			}
		}

	}

}