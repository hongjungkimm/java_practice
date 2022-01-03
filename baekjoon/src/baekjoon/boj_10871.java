package baekjoon;

import java.util.Scanner;

public class boj_10871 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int tmp = sc.nextInt();
			if (x > tmp) {
				System.out.print(tmp);
				System.out.print(" ");
			}
		}
		sc.close();
	}

}
