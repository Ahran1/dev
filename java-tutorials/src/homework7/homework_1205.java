package homework7;

import java.util.Scanner;

public class homework_1205 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		scanner.close();
		double c = a + b;
		double d = Math.max(a - b, b - a);
		double e = a * b;
		double f = Math.max(a / b, b / a);
		double g = Math.max(Math.pow((double) a, (double) b), Math.pow((double) b, (double) a));
		double max = 0;
		if (c >= d && c >= e && c >= f && c >= g) {
			max = c;
		} else if (d >= e && d >= f && d >= g && d >= c) {
			max = d;
		} else if (e >= f && e >= g && e >= c && e >= d) {
			max = e;
		} else if (f >= g && f >= c && f >= d && f >= e) {
			max = f;
		} else if (g >= c && g >= d && g >= e && g >= f) {
			max = g;
		}
		System.out.printf("%.6f", (double) max);

	}
}