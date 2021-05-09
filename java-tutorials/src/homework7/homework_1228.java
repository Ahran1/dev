package homework7;

import java.util.Scanner;

public class homework_1228 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		double height = scanner.nextDouble();
		double weight = scanner.nextDouble();
		scanner.close();

		double standard = (height - 100) * 0.9;
		double obesity = (weight - standard) * 100 / standard;

		if (obesity <= 10) {
			System.out.println("정상");
		} else if (obesity >= 10 && obesity <= 20) {
			System.out.println("과체중");
		} else {
			System.out.println("비만");
		}	
		
	}
}