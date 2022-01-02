package baekjoon;

import java.util.Scanner;

public class boj_2908 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		String reverseA = "";
		String reverseB = "";
		
		for (int i = 2; i > -1; i--) {
			reverseA += a.charAt(i);
			reverseB += b.charAt(i);
		}
		
		int reverseIntA = Integer.parseInt(reverseA);
		int reverseIntB = Integer.parseInt(reverseB);
		
		if (reverseIntA > reverseIntB) {
			System.out.println(reverseIntA);
		} else {
			System.out.println(reverseIntB);
		}
		sc.close();
	}

}
