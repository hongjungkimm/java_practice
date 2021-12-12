package baekjoon;

import java.util.Scanner;

public class boj_1330 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int firstNum = sc.nextInt();
		int secondNum = sc.nextInt();
		
		if(firstNum > secondNum) {
			System.out.println(">");
		}
		else if(firstNum < secondNum) {
			System.out.println("<");
		}
		else {
			System.out.println("==");
		}
		sc.close();
	}

}
