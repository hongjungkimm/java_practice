package baekjoon;

import java.util.Scanner;

public class boj_2675 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		for (int i = 0; i < tc; i++) {
			String result = "";
			int cnt = sc.nextInt();
			String str = sc.next();
			for (int j = 0; j < str.length(); j++) {
				for (int k = 0; k < cnt; k++) {
					result += str.charAt(j);					
				}
			}
			System.out.println(result);
		}
		sc.close();
	}
}
