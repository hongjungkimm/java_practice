package baekjoon;

import java.util.Scanner;

public class boj_11720 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String num = sc.next();
		int result = 0;
		for (int i = 0; i < n; i++) {
			int tmp = Character.getNumericValue(num.charAt(i));
			result += tmp;
		}
		System.out.println(result);
		sc.close();
	}

}
