package baekjoon;

import java.util.Scanner;

public class boj_10818 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int firstNum = sc.nextInt();
		int maxNum = firstNum;
		int minNum = firstNum;
		for (int i = 0; i < num - 1; i++) {
			int tmp = sc.nextInt();
			if (tmp > maxNum) {
				maxNum = tmp;
			}
			else if (tmp < minNum) {
				minNum = tmp;
			}
		}
		System.out.print(minNum);
		System.out.print(" ");
		System.out.print(maxNum);
		sc.close();
	}

}
