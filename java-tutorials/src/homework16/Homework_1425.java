package homework16;

import java.util.Scanner;

public class Homework_1425 {

	public static void main(String[] args) {

		int[] h = new int[100];
		boolean[] chk = new boolean[100];
		int n, c, minIdx;

		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		c = scanner.nextInt();
		h[0] = 2100000000;
		for (int i = 1; i <= n; i++) {
			h[i] = scanner.nextInt();
		}
		scanner.close();

		for (int i = 0; i < n; i++) {
			// 최소값 찾기
			minIdx = 0;
			for (int j = 1; j <= n; j++) {
				if (!chk[j] && h[minIdx] > h[j]) {
					minIdx = j;
				}
			}
			System.out.print(h[minIdx] + " ");
			if ((i + 1) % c == 0) {
				System.out.println();
			}
			chk[minIdx] = true;
		}

	}

}
