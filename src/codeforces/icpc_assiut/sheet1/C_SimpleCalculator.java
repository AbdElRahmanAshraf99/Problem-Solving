package codeforces.icpc_assiut.sheet1;

import java.util.Scanner;

public class C_SimpleCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextInt();
		long b = sc.nextInt();
		System.out.println(a + " + " + b + " = " + (a + b));
		System.out.println(a + " * " + b + " = " + (a * b));
		System.out.println(a + " - " + b + " = " + (a - b));
	}
}
