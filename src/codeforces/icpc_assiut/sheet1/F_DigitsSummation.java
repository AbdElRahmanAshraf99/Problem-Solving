package codeforces.icpc_assiut.sheet1;

import java.util.Scanner;

public class F_DigitsSummation {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long n1 = in.nextLong();
		long n2 = in.nextLong();
		System.out.println(((int) (n1 % 10)) + ((int) (n2 % 10)));
	}
}
