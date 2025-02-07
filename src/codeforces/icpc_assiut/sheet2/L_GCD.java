package codeforces.icpc_assiut.sheet2;

import java.util.Scanner;

public class L_GCD {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int min = Math.min(n1, n2);
		int max = Math.max(n1, n2);
		if (max % min == 0) {
			System.out.println(min);
			return;
		}
		for (int i = min / 2; i > 0; i--) {
			if (n1 % i != 0)
				continue;
			if (n2 % i != 0)
				continue;
			System.out.println(i);
			break;
		}
	}
}
