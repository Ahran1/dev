package homework5;

import java.util.Scanner;

public class homework_1162 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int y = scanner.nextInt();
		int m = scanner.nextInt();
		int d = scanner.nextInt();
		int n = (y - m + d);
		scanner.close();
		if (n % 10 == 0) {
			System.out.println("대박");
		} else {
			System.out.println("그럭저럭");
		}

	}

}
