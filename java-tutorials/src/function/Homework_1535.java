package function;

import java.util.Scanner;

public class Homework_1535 {

	static int n;
	static int[] d = new int[110];

	static int f() {
		int idx = 0;
		for (int i = 0; i < n; i++) {
			if (d[idx] < d[i]) {
				idx = i;
			}
		}
		return idx + 1;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			d[i] = scanner.nextInt();
		}
		scanner.close();
		System.out.println(f());

	}

}
