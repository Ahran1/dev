package homework7;

import java.util.Scanner;

public class homework_1231 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String expression = scanner.next();
		scanner.close();

		Scanner scanner2 = new Scanner(expression);
		scanner2.useDelimiter("[+\\Q-\\E*/\n\r]");
		int a = scanner2.nextInt();
		int b = scanner2.nextInt();
		scanner2.close();
		

//		String[] split = expression.split("[+\\Q-\\E*/\n\r]");
//		int a = Integer.parseInt(split[0]);
//		int b = Integer.parseInt(split[2]);

		if (expression.contains("+")) {
			System.out.printf("%d", a + b);
		} else if (expression.contains("-")) {
			System.out.printf("%d", a - b);

		} else if (expression.contains("*")) {
			System.out.printf("%d", a * b);

		} else {
			System.out.printf("%.2f", (double) a / b);

		}
	}

}