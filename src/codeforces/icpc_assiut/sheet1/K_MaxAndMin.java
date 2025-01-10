package codeforces.icpc_assiut.sheet1;

import java.util.Scanner;

public class K_MaxAndMin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n1 = sc.nextLong();
		long n2 = sc.nextLong();
		long n3 = sc.nextLong();
		long max = n1 >= n2 && n1 >= n3 ? n1 : (n2 >= n1 && n2 >= n3) ? n2 : n3;
		long min = n1 <= n2 && n1 <= n3 ? n1 : (n2 <= n1 && n2 <= n3) ? n2 : n3;
		System.out.println(min + " " + max);
	}
}
