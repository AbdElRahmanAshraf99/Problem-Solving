package codeforces.icpc_assiut.sheet2;

import java.util.Scanner;

public class K_Divisors {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		System.out.println(1);
		if (input == 1)
			return;
		for (int i = 2; i <= input / 2; i++) {
			if (input % i == 0)
				System.out.println(i);
		}
		System.out.println(input);
	}
}
