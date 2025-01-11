package codeforces.icpc_assiut.contest1;

import java.util.Scanner;

public class F_AddingBits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		System.out.println(bitwiseAdd(n1, n2));
	}

	public static int bitwiseAdd(int a, int b) {
		while (b != 0) {
			a = a ^ b;
			b = 0;
		}
		return a;
	}
}
