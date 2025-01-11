package codeforces.icpc_assiut.contest1;

import java.util.Scanner;

public class C_NextAlphabet {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextLine().charAt(0);
		n++;
		if (n > 122)
			n = 97;
		System.out.println((char) n);
	}
}
