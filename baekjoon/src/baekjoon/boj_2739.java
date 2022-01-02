package baekjoon;

import java.util.Scanner;

public class boj_2739 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String strNum = Integer.toString(num);
		for (int i = 1; i < 10; i++) {
			String strI = Integer.toString(i);
			String resultNum = Integer.toString(num * i);
			System.out.println(strNum + " * " + strI + " = " + resultNum);
		}
		sc.close();
	}
}
