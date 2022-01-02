package baekjoon;

import java.util.Scanner;

public class boj_2884 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hour = sc.nextInt();
		int minute = sc.nextInt();
		int remainder = 0;
		
		if (minute >= 45) {
			minute -= 45;
		} else {
			remainder = 45 - minute;
			minute = 60 - remainder;
			if (hour == 0) {
				hour = 23;
			} else {
				hour -= 1;				
			}
		}
		System.out.print(hour);
		System.out.print(" ");
		System.out.println(minute);
		sc.close();
	}
}
