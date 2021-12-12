package practice;

import java.util.Scanner;

public class practice4 {
	public static int function(int number, int k) {
		for(int i = 1; i <= number; i++)
		{
			if(number % i == 0)
			{
				k--;
				if(k == 0)
				{
					return i;
				}
			}
		}
		return -1;
	}
	
	// 실행함수
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력해주세요: ");
		int a = sc.nextInt();
		System.out.print("몇 번째 약수를 찾을 것인지 입력해주세요: ");
		int b = sc.nextInt();
		
		int result = function(a, b);
		if(result == -1)
		{
			System.out.println("10의 3번째 약수는 없습니다.");
		}
		else
		{
			System.out.println(function(a, b));
		}
		sc.close();
	}

}
