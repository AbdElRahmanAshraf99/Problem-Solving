package codeforces.icpc_assiut.sheet1;

import java.util.Scanner;

public class Z_HardCompare {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n1 = sc.nextLong();
		long n2 = sc.nextLong();
		long n3 = sc.nextLong();
		long n4 = sc.nextLong();
		double result1 = n2 * Math.log(n1);
		double result2 = n4 * Math.log(n3);
		System.out.println(result1 > result2 ? "YES" : "NO");
	}
}
