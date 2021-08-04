package homework20;

import java.util.Scanner;

public class Homework_1563 {

	static int n, m, x;

	static int max(int p, int q) {
		return p >= q ? p : q;
	}

	static int min(int p, int q) {
		return p <= q ? p : q;
	}

	static int mid(int p, int q, int r) {
		int a = max(p, q);
		int b = max(q, r);
		int c = min(a, b);

		if (a == b) {
			return max(p, r);
		} else {
			return c;
		}
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		m = scanner.nextInt();
		x = scanner.nextInt();
		scanner.close();
		System.out.println(mid(n, m, x));

	}

}