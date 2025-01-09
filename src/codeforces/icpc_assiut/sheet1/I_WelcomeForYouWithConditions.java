package codeforces.icpc_assiut.sheet1;

import java.util.Scanner;

public class I_WelcomeForYouWithConditions
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		long n1 = sc.nextLong();
		long n2 = sc.nextLong();
		System.out.println(n1 >= n2 ? "Yes" : "No");
	}
}
