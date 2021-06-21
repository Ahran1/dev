package homework15;

import java.util.Scanner;

public class Homework_1416 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();

		int s = 1;
		for (int i = 0; Math.pow(2, i) <= n; i++) {
			s = i + 1;
		}
		int[] arr = new int[s];
		
		for (int i = 0; i < s; i++) {
			arr[i] = n % 2;
			n = n / 2;
		}
		for (int i = s - 1; i >= 0; i--) {
			System.out.print(arr[i]);
		}
	}
}