package homework14;

import java.util.Scanner;

public class Homework_1405 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}
		scanner.close();
		
		for(int i = 0; i < n; i++) {
			
			for(int j = i; j <n; j++) {
				System.out.print(arr[j]+" ");
			}
			for(int j = 0; j< i; j++) {
				System.out.print(arr[j]+" ");
			}
			System.out.println();
		}
		
	}

}