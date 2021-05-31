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
 * �ݺ�(n��, i, i = 1 ~ n) if(i = 1 or n �̸�) �ݺ�(n��, j, j = 1 ~ n) �� 1�� ��� else ��1��
 * ��� �ݺ�(n-2��, k, k = 1 ~ n-2) ������� ��1�� ��� �ٹٲ�
 * 
 * i : 1 -> �� n�� i : 2 -> �� 1��, ���� n-2��, �� 1�� i : 3 -> �� 1��, ���� n-2��, �� 1�� : : i
 * : n -> �� n��
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