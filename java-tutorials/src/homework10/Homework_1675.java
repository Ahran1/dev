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

 반복(n번, i, 1~n)
	반복(n+1-i번, j, 1~n+1-i)
		+하나 출력
	줄바꿈
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





















