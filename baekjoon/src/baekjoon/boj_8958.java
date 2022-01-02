package baekjoon;

import java.util.Scanner;

public class boj_8958 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		
		for (int i = 0; i < tc; i++) {
			String result = sc.next();
			int score = 0;
			int tmp = 0;
			for (int j = 0; j < result.length(); j++) {
				if (result.charAt(j) == 'O') {
					tmp += 1;
					score += tmp;
				} else {
					tmp = 0;
				}
			}
			System.out.println(score);
		}
		sc.close();
	}

}
