package homework9;

import java.util.Scanner;

public class homework_1283 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int data = 1;
		double total_income = a;

		for (int i = 1; i <= b; i++) {
			data = scanner.nextInt();
			total_income = total_income * (100 + data) / 100;
		}
		scanner.close();
		double net_income = total_income - a;

		System.out.printf("%.0f\n", net_income);
		if (net_income > 0) {
			System.out.println("good");
		} else if (net_income == 0) {
			System.out.println("same");
		} else {
			System.out.println("bad");
		}

	}

}