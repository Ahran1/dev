package homework9;

import java.util.Scanner;

public class homework_1275 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int k = scanner.nextInt();
		scanner.close();
		
		int value = 1;
		int i = 1;
		
		while (i <= k) {
			value *= n;
			i++;
		}
		System.out.println(value);

	}
}