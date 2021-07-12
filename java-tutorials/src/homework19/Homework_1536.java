package homework19;

import java.util.Scanner;

public class Homework_1536 {

	static int n;
	static int[] a = new int[110];

	static int f() {
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}
		return min;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
		}
		scanner.close();
		System.out.println(f());

	}

}
