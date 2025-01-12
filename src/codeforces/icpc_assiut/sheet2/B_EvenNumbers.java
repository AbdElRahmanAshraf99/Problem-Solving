package codeforces.icpc_assiut.sheet2;

import java.util.Scanner;

public class B_EvenNumbers {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for (int i = 2; i <= n; i += 2)
			System.out.println(i);
		if (n == 1)
			System.out.println(-1);
	}
}
