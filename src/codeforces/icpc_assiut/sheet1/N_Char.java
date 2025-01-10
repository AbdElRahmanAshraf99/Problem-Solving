package codeforces.icpc_assiut.sheet1;

import java.util.Scanner;

public class N_Char {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char c = sc.next().charAt(0);
		System.out.println(Character.isUpperCase(c) ? Character.toLowerCase(c) : Character.toUpperCase(c));
	}
}
