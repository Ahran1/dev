package homework20;

import java.util.Scanner;

public class Homework_1551 {

	static int n, k;
	static int[] d = new int[100010];

	static int f(int k) {
		int i;
		for (i = 0; i < n; i++) {
			if (k == d[i]) {
				i = i + 1;
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();

		for (int i = 0; i < n; i++) {
			d[i] = scanner.nextInt();
		}

		k = scanner.nextInt();
		scanner.close();

		System.out.println(f(k));

	}

}