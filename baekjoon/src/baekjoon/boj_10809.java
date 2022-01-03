package baekjoon;

import java.util.Scanner;

public class boj_10809 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		int[] alphabet = new int[26];
		for (int i = 0; i < word.length(); i++) {
			if (alphabet[word.charAt(i) - 97] == 0) {
				alphabet[word.charAt(i) - 97] = i + 1;
			}
		}
		for (int i = 0; i < 26; i++) {
			System.out.print(alphabet[i] - 1);
			System.out.print(" ");
		}
		sc.close();
	}

}
