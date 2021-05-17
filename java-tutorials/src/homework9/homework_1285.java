package homework9;

import java.util.Scanner;

public class homework_1285 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String expression = scanner.next();
		scanner.close();

		Scanner sc = new Scanner(expression);
		sc.useDelimiter("[+\\Q-\\E*/=]");

		int num, result = sc.nextInt();
		char ch;
		for (int i = 0; (ch = expression.charAt(i)) != '='; i++) {
			if (ch < '0' || ch > '9') {
				num = sc.nextInt();
				switch (ch) {
				case '+':
					result += num;
					break;
				case '-':
					result -= num;
					break;
				case '*':
					result *= num;
					break;
				case '/':
					result /= num;
					break;
				}
			}
		}
		System.out.println(result);
		sc.close();

	}
}