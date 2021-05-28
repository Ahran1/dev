package homework11;

import java.util.Scanner;

public class Homework_1355 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i > j) {
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
 * 
 * +가 n줄 반복 반복(n번, i, 1 ~ n) 반복(n번, j, 1 ~ n) if(i>j) 공백 한개 출력 else 별 한개 출력 줄바꿈
 * 
 * ++++ i1j1 i1j2 i1j3 i1j4 +++ i2j1 i2j2 i2j3 i2j4 ++ i3j1 i3j2 i3j3 i3j4 +
 * i4j1 i4j2 i4j3 i4j4
 * 
 * 
 */