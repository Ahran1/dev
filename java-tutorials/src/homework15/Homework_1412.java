package homework15;

import java.util.Scanner;

public class Homework_1412 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		scanner.close();
		int[] arr = new int[26];

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				arr[(str.charAt(i) - 97)]++;
			}
		}

		for (int i = 0; i < 26; i++) {
			System.out.printf("%c:%d\n", (char) i + 97, arr[i]);
		}

	}

}
