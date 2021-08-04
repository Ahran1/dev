package homework20;

import java.util.Scanner;

public class Homework_1565 {

	static int a, b;

	static long lcm(int a, int b) {
		int bg = (a >= b ? a : b);
		int sm = (a >= b ? b : a);
		int i = 1;

		while ((long) (bg * i) % sm != 0) {
			i++;
		}

		return (long) bg * i;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		a = scanner.nextInt();
		b = scanner.nextInt();
		scanner.close();
		System.out.printf("%d", lcm(a, b));

	}

}