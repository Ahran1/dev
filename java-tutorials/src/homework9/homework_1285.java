package homework9;

import java.util.Scanner;

public class homework_1285 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String expression = scanner.next();
		scanner.close();

		String[] split = expression.split("(?<=\\d)(?=\\D)|(?<=\\D)(?=\\d)");

		int cal = Integer.parseInt(split[0]);
		for (int i = 1, j = 2; i < split.length && j < split.length; i += 2, j += 2) {

			if (split[i] == "+") {
				cal = cal + Integer.parseInt(split[j]);
			} else if (split[i] == "-") {
				cal = cal - Integer.parseInt(split[j]);
			} else if (split[i] == "*") {
				cal = cal * Integer.parseInt(split[j]);
			} else if (split[i] == "/") {
				cal = cal / Integer.parseInt(split[j]);
			}

			if (split[i] == "=") {
				break;
			}

		}
		System.out.println(cal);
	}
}