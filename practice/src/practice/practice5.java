package practice;

import java.util.Scanner;

public class practice5 {
	public static int max(int a, int b) {
		return (a > b) ? a : b;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("생성할 배열의 크기를 입력해주세요: ");
		int number = sc.nextInt();
		int[] array = new int[number];
		int arrayLength = array.length;
		
		for(int i = 0; i < number; i++)
		{
			System.out.print("배열에 입력할 정수를 하나씩 입력해주세요: ");
			array[i] = sc.nextInt();
		}
		
		System.out.print("배열: ");
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
		System.out.println("배열 중 가장 큰 수: " + result);
		System.out.println("배열의 크기: " + arrayLength);
		sc.close();
	}

}
