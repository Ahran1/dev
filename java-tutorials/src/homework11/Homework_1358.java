package homework11;

import java.util.Scanner;

public class Homework_1358 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();
		
		for(int i = 1; i <= n/2 +1;i++) {
			for(int j = n/2+1;j <=n;j++) {
				if(i+j<=n/2+1) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		

	}

}

/*
�ݺ�(n/2 + 1��, i, 1 ~ n/2 + 1)
	�ݺ�( ,j , n/2+1 ~ n)
		if(i+j <= n/2+1)
			�������
		else
			��

n=3
 *	2
*** 3

n=5
  *		3
 ***	4
*****	5


*/