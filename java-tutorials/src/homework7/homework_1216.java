package homework7;

import java.util.Scanner;

public class homework_1216 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int i = scanner.nextInt();
		int pi = scanner.nextInt();
		int e = scanner.nextInt();
		scanner.close();
		int net = pi - e;
		if (net > i) {
			System.out.println("advertise");
		} else if (net < i) {
			System.out.println("do not advertise");
		} else {
			System.out.println("does not matter");
		}	
		
	}
}