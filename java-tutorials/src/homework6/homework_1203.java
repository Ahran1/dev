package homework6;

import java.util.Scanner;

public class homework_1203 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int BMI = scanner.nextInt();
		scanner.close();

		if (BMI <= 10) {
			System.out.println("정상");
		} else if (BMI <= 20) {
			System.out.println("과체중");
		} else {
			System.out.println("비만");
		}

	}
}