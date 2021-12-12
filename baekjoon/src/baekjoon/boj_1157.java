package baekjoon;

import java.util.Scanner;

public class boj_1157 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[26];
		String input = sc.nextLine();
		int max = 0, cnt = 0, index = 0;
		
		input = input.toUpperCase();
		
		for(int i = 0; i < input.length(); i++) {
			arr[input.charAt(i)-65]++;
		}
		
		for(int i = 0; i < 26; i++) {
			if(arr[i] > max) {
				max = arr[i];
				index = i;
				cnt = 0;
			}
			else if(max != 0 && arr[i] == max) {
				cnt++;
			}
		}
		
		if (cnt > 0) {
			System.out.println("?");
		}
		else
		{
			System.out.println((char) (index + 65));
		}
		sc.close();
	}

}
