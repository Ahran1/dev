package homework15;

import java.util.Scanner;

public class Homework_1430 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
		}

		boolean flag;
		int m = scanner.nextInt();
		for (int i = 0; i < m; i++) {
			int l = scanner.nextInt();
			flag = true;
			for (int j = 0; j < n; j++) {
				if (l == a[j]) {
					System.out.print("1 ");
					flag = false;
					break;
				}
			}
			if (flag) {
				System.out.print("0 ");
			}
		}
		scanner.close();

	}

}