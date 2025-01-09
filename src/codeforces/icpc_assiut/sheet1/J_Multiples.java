package codeforces.icpc_assiut.sheet1;

import java.util.Scanner;

public class J_Multiples
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		long n1 = sc.nextLong();
		long n2 = sc.nextLong();
		System.out.println((n1 % n2 == 0 || n2 % n1 == 0 ? "" : "No ") + "Multiples");
	}
}
