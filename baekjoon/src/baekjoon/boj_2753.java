package baekjoon;

import java.util.Scanner;

public class boj_2753 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		int num = 0;
		
		if (year % 4 == 0) {
			if (year % 100 != 0 || year % 400 == 0) {
				num = 1;
			}
		}
		System.out.println(num);
		sc.close();
	}
}
