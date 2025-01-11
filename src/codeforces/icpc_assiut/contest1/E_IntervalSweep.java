package codeforces.icpc_assiut.contest1;

import java.util.Scanner;

public class E_IntervalSweep {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a==0 && b==0)
			System.out.println("NO");
		else if (Math.abs(a-b)==0||Math.abs(a-b)==1)
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}
