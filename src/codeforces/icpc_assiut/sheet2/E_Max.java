package codeforces.icpc_assiut.sheet2;

import java.util.Scanner;

public class E_Max {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int max = 0;
		for (int i = 0; i < n; i++) {
			int input = sc.nextInt();
			if (input > max)
				max = input;
		}
		System.out.println(max);
	}
}
