package practice;

import java.util.Scanner;

public class practice5 {
	public static int max(int a, int b) {
		return (a > b) ? a : b;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �迭�� ũ�⸦ �Է����ּ���: ");
		int number = sc.nextInt();
		int[] array = new int[number];
		int arrayLength = array.length;
		
		for(int i = 0; i < number; i++)
		{
			System.out.print("�迭�� �Է��� ������ �ϳ��� �Է����ּ���: ");
			array[i] = sc.nextInt();
		}
		
		System.out.print("�迭: ");
		for(int i = 0; i < number; i++)
		{
			System.out.print(array[i] + " ");
		}
		System.out.println();
		
		int result = -1;
		for(int i = 0; i < number; i++)
		{
			result = max(result, array[i]);
		}
		System.out.println("�迭 �� ���� ū ��: " + result);
		System.out.println("�迭�� ũ��: " + arrayLength);
		sc.close();
	}

}
