package homework12;

import java.util.Scanner;

public class Homework_1361 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();

		for (int i = 1; i <= n; i++) {
			for (int j = 0; j <= i - 2; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
/*

n=1			n=2			n=3		 		�ݺ�(n��, i, 1 ~ n)
											�ݺ�(i-1��, j, 0 ~ i-2)
``			``			``						�������
 			 ``			 ``					�ݺ�(2��, j, 0 ~ 1)
			  			  ``				�ٹٲ�
										����
11 12		11 12		11 12			0
			   22 23	   22 23 		1
							  33 34		2


*/