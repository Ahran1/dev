package homework14;

import java.util.Scanner;

public class Homework_1093 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] arr = new int[24];

		for (int i = 0; i < n; i++) {
			arr[scanner.nextInt()]++;
		}
		for (int i = 1; i < 24; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}