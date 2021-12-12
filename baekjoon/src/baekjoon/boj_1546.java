package baekjoon;

import java.util.Scanner;

public class boj_1546 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] examResult = new int [n];
		int max = 0;
		double sum = 0.0;
		for(int i = 0; i < n; i++) {
			examResult[i]  = sc.nextInt();
		}
		
		for(int i = 0; i < n; i++) {
			if(examResult[i] > max) {
				max = examResult[i];
			}
		}
		
		for(int i = 0; i < n; i++) {
			sum += examResult[i] / (double) max * 100;
		}
		
		System.out.println(sum / n);
		sc.close();
	}

}
