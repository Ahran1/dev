package homework4;

import java.util.Scanner;

public class homework_1067 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int a = scanner.nextInt();
		
		if(a < 0) {
			if(a%2 ==0) {
				System.out.printf("%s", "minus\neven");
			} else {
				System.out.printf("%s\n", "minus\nodd");
				
			}
		} else {
			if(a%2 ==0) {
				System.out.printf("%s", "plus\neven");
			} else {
				System.out.printf("%s", "plus\nodd");
			}
		}

		scanner.close();
	}

}