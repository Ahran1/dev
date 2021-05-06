package homework6;

import java.util.Scanner;

public class homework_1163 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int y = scanner.nextInt();
		int m = scanner.nextInt();
		int d = scanner.nextInt();

		int n = ((y + m + d) / 100);

		if (n % 2 == 0) {
			System.out.println("대박");
		} else {
			System.out.println("그럭저럭");
		}
		scanner.close();
	}

}
