package tutorials.inputs;

import java.util.Scanner;

public class InputsEx {

	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			System.out.println(a);
			System.out.println(b);
			scanner.close();
	}

}
