package codeforces.icpc_assiut.sheet2;

import java.util.Scanner;

public class F_MultiplicationTable {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 1; i <= 12; i++)
			System.out.println(n + " * " + i + " = " + i * n);
	}
}
