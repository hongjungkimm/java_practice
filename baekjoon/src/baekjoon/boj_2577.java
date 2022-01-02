package baekjoon;

import java.util.Scanner;

public class boj_2577 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int resultNum = 1;
		for (int i = 0; i < 3; i++) {
			int num = sc.nextInt();
			resultNum *= num;
		}
		
		String strNum = String.valueOf(resultNum);
		for (int i = 0; i < 10; i++) {
			int cnt = 0;
			for (int j = 0; j < strNum.length(); j++) {
				if (strNum.charAt(j) - '0' == i) {
					cnt += 1;
				}
			}
			System.out.println(cnt);
		}
		sc.close();
	}
}
