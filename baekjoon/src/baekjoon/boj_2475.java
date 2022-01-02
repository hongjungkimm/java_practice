package baekjoon;

import java.util.Scanner;

public class boj_2475 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int resultNum = 0;
		for (int i = 0; i < 5; i++) {
			int num = sc.nextInt();
			resultNum += Math.pow(num, 2);
		}
		System.out.println(resultNum % 10);
		sc.close();
	}
}
