package tutorials.loops;

import java.util.Scanner;

public class ContinueEx {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		for (int i = 0; i <= 10; i++) {
			if (i == a) {
				continue;
			}
			System.out.println(i);
		}
		scanner.close();
	}

}
