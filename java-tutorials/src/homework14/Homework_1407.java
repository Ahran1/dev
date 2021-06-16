package homework14;

import java.util.Scanner;

public class Homework_1407 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		char[] ch = new char[100];
		scanner.close();
		
		for (int i = 0; i < str.length(); i++) {
			ch[i] = str.charAt(i);
		}

		for (int i = 0; i < str.length(); i++) {
			if (ch[i] != ' ') {
				System.out.print(ch[i]);
			}
		}
	}
}