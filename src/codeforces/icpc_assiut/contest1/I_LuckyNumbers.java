package codeforces.icpc_assiut.contest1;

import java.util.Scanner;

public class I_LuckyNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n % 10 == 0) {
			System.out.println("YES");
			return;
		}
		int second = (n % 10);
		int first = (n - second) / 10;
		if (first % second == 0 || second % first == 0)
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}
