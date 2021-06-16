package homework14;

import java.util.Scanner;

public class Homework_1409 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int[] arr = new int[11];

		for (int i = 1; i < 11; i++) {
			arr[i] = scanner.nextInt();
		}
		int k = scanner.nextInt();
		System.out.println(arr[k]);

		scanner.close();
	}

}