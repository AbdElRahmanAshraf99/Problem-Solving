package codeforces.icpc_assiut.contest1;

import java.util.Scanner;

public class B_MemoAndMomo {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long n1 = in.nextLong();
		long n2 = in.nextLong();
		long k = in.nextLong();
		if (n1 % k == 0 && n2 % k == 0)
			System.out.println("Both");
		else if (n1 % k == 0 && n2 % k != 0)
			System.out.println("Memo");
		else if (n1 % k != 0 && n2 % k == 0)
			System.out.println("Momo");
		else
			System.out.println("No One");
	}
}
