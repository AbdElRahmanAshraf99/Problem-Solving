package codeforces.icpc_assiut.contest1;

import java.util.Scanner;

public class D_AliBabaAndPuzzles {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n1 = sc.nextLong();
		long n2 = sc.nextLong();
		long n3 = sc.nextLong();
		long n4 = sc.nextLong();
		long[] results = new long[] { (n1 + n2 - n3), (n1 + n2 * n3), (n1 - n2 + n3), (n1 - n2 * n3), (n1 * n2 + n3), (n1 * n2 - n3) };
		for (long result : results) {
			if (result == n4) {
				System.out.println("YES");
				return;
			}
		}
		System.out.println("NO");
	}
}
