package homework10;

import java.util.Scanner;

public class Homework_1675 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		char c;
		for (int i = 0; i < str.length(); i++) {
			c = str.charAt(i);
			if (c >= 'a' && c <= 'z') {
				c = (char) (c - 3);
				if (c < 'a') {
					c = (char) (c + 26);
				}
			}
			System.out.print(c);
		}
		scanner.close();

	}

}

/*

*				
**						
***					
****

++++
+++
++
+

 �ݺ�(n��, i, 1~n)
	�ݺ�(n+1-i��, j, 1~n+1-i)
		+�ϳ� ���
	�ٹٲ�
n+1-i

i:1 -> n	
i:2 -> n-1
i:3 -> n-2	
.	.
.	.
i:n - > 1


*
*
*
*
*
*/





















