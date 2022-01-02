package baekjoon;

import java.util.Scanner;

public class boj_2562 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int maxNum = 0;
		int maxIdx = 0;
		
		for (int i = 0; i < 9; i++) {
			int num = sc.nextInt();
			if (num > maxNum) {
				maxNum = num;
				maxIdx = i;
			}
		}
		System.out.println(maxNum);
		System.out.println(maxIdx + 1);
		sc.close();
	}
}
