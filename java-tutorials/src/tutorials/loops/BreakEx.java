package tutorials.loops;

import java.util.Scanner;

public class BreakEx {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
			if (i == a) {
				break;
			}
		}
		scanner.close();

	}

}
