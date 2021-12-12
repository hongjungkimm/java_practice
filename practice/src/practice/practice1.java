package practice;

import java.util.Scanner;

public class practice1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하세요: ");
		String name = sc.nextLine();
		System.out.println(name);
		sc.close();
	}

}
