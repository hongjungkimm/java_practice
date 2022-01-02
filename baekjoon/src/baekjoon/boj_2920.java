package baekjoon;

import java.util.Scanner;

public class boj_2920 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String note = "";
		for (int i = 0; i < 8; i++) {
			note += sc.next();
		}
		
		if (note.equals("12345678")) {
			System.out.println("ascending");
		}
		else if (note.equals("87654321")) {
			System.out.println("descending");
		} else {
			System.out.println("mixed");
		}
		sc.close();
	}

}
