package codeforces.icpc_assiut.sheet1;

import java.util.Scanner;

public class G_SummationFrom1ToN {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		System.out.println((n * (n + 1)) / 2);
	}
}
