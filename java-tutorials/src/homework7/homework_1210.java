package homework7;

import java.util.Scanner;

public class homework_1210 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int t1 = 0;
		int t2 = 0;
		scanner.close();

		if (a == 1) {
			t1 = 400;
		} else if (a == 2) {
			t1 = 340;
		} else if (a == 3) {
			t1 = 170;
		} else if (a == 4) {
			t1 = 100;
		} else if (a == 5) {
			t1 = 70;
		}

		if (b == 1) {
			t2 = 400;
		} else if (b == 2) {
			t2 = 340;
		} else if (b == 3) {
			t2 = 170;
		} else if (b == 4) {
			t2 = 100;
		} else if (b == 5) {
			t2 = 70;
		}

		if (t1 + t2 > 500) {
			System.out.println("angry");
		} else {
			System.out.println("no angry");
		}
		
	}
}