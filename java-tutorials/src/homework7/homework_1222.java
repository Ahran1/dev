package homework7;

import java.util.Scanner;

public class homework_1222 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int time = scanner.nextInt();
		int s1 = scanner.nextInt();
		int s2 = scanner.nextInt();
		scanner.close();

		int ep;
		if (time % 5 == 0) {
			ep = (90 - time) / 5;
		} else {
			ep = (90 - time) / 5 + 1;
		}

		if (s1 + ep > s2) {
			System.out.println("win");
		} else if (s1 + ep == s2) {
			System.out.println("same");
		} else {
			System.out.println("lose");
		}	
		
	}
}