package homework7;

import java.util.Scanner;

public class homework_1214 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int y = scanner.nextInt();
		int m = scanner.nextInt();
		scanner.close();

		if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) {
			System.out.println(31);
		}

		if (m == 4 || m == 6 || m == 9 || m == 11) {
			System.out.println(30);
		}

		if (y % 400 == 0 || y % 4 == 0 && y % 100 != 0) {
			if (m == 2) {
				System.out.println(29);
			}
		} else if (m == 2) {
			System.out.println(28);
		}	
		
	}
}