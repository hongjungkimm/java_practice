package baekjoon;

import java.util.Scanner;

public class boj_1152 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine().trim();
		String[] result = input.split(" ");
		int resultLen = result.length;
		
		if(input.isEmpty()) {
			System.out.println(0);
		}
		else
		{
			System.out.println(resultLen);			
		}
		sc.close();
	}
}
