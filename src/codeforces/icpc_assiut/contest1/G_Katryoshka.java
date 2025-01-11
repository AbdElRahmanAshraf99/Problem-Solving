package codeforces.icpc_assiut.contest1;

import java.util.Scanner;

public class G_Katryoshka {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long m = sc.nextLong();
		long k = sc.nextLong();
		long katryoshkaCount = Math.min(k, Math.min(n, m) + (n - Math.min(n, m)) / 2);
		System.out.println(katryoshkaCount);
	}
}
