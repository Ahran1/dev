package homework7;

import java.util.Scanner;

public class homework_1204 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		String m = "";
		scanner.close();

		if (n / 10 == 1) {
			m = "th";
		} else if (n % 10 == 1) {
			m = "st";
		} else if (n % 10 == 2) {
			m = "nd";
		} else if (n % 10 == 3) {
			m = "rd";
		} else {
			m = "th";
		}

		System.out.println(n + m);
	}
}