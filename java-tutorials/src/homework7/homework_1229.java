package homework7;

import java.util.Scanner;

public class homework_1229 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		double height = scanner.nextDouble();
		double weight = scanner.nextDouble();
		scanner.close();

		double standard;
		if (height < 150) {
			standard = height - 100;
		} else if (height < 160) {
			standard = (height - 150) / 2 + 50;
		} else {
			standard = (height - 100) * 0.9;
		}

		double bmi = (weight - standard) * 100 / standard;

		if (bmi <= 10) {
			System.out.println("����");
		} else if (bmi >= 10 && bmi <= 20) {
			System.out.println("��ü��");
		} else {
			System.out.println("��");
		}	
		
	}
}