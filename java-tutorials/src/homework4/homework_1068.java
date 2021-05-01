package homework4;

import java.util.Scanner;

public class homework_1068 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int a = scanner.nextInt();
		
		if(a >=90) {
			System.out.printf("%s", "A");
		} else if (a >= 70){
			System.out.printf("%s", "B");
		} else if (a >= 40) {
			System.out.printf("%s", "C");
		} else {
			System.out.printf("%s", "D");
		}
		scanner.close();
	}

}