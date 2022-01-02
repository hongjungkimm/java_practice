package baekjoon;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class boj_3052 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<Integer> remainders = new HashSet<Integer>();
		for (int i = 0; i < 10; i++) {
			remainders.add(sc.nextInt() % 42);
		}
		System.out.println(remainders.size());
		sc.close();
	}

}
