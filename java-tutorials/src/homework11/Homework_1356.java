package homework11;

import java.util.Scanner;

public class Homework_1356 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == 1 || i == n || j == 1 || j == n) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
/*
 * 
 * 반복(n번, i, i = 1 ~ n) if(i = 1 or n 이면) 반복(n번, j, j = 1 ~ n) 별 1개 출력 else 별1개
 * 출력 반복(n-2번, k, k = 1 ~ n-2) 공백출력 별1개 출력 줄바꿈
 * 
 * i : 1 -> 별 n개 i : 2 -> 별 1개, 공백 n-2개, 별 1개 i : 3 -> 별 1개, 공백 n-2개, 별 1개 : : i
 * : n -> 별 n개
 * 
 * +++ i1j1 i1j2 i1j3 + + i2j1 i2j2 i2j3 +++ i3j1 i3j2 i3j3
 * 
 * ++++ i1j1 i1j2 i1j3 i1j4 + + i2j1 i2j2 i2j3 i2j4 + + i3j1 i3j2 i3j3 i3j4 ++++
 * i4j1 i4j2 i4j3 i4j4
 * 
 * 
 * i
 * 
 * 
 */