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
	
	// �����Լ�
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �Է����ּ���: ");
		int a = sc.nextInt();
		System.out.print("�� ��° ����� ã�� ������ �Է����ּ���: ");
		int b = sc.nextInt();
		
		int result = function(a, b);
		if(result == -1)
		{
			System.out.println("10�� 3��° ����� �����ϴ�.");
		}
		else
		{
			System.out.println(function(a, b));
		}
		sc.close();
	}

}
