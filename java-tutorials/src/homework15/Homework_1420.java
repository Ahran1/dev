package homework15;

import java.util.Scanner;

public class Homework_1420 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String[] name = new String[50];
		int[] score = new int[50];
		
		int n = scanner.nextInt();
		for(int i = 0; i<n; i++) {
			name[i]=scanner.next();
			score[i] = scanner.nextInt();
		}
		scanner.close();
		
		for(int i = 0; i < n; i++) {
			int count = 0;
			for(int j = 0; j <n; j++) {
				if(i!=j && score[i] < score[j]) {
					count++;
				}
			} 
			if(count == 2) {
				System.out.println(name[i]);
				break;
			}
		}
		
	}

}


/*
	
	1-2			
	1-2
	1-4
	1-5

	2-1
	2-3
	2-4
	2-5











*/