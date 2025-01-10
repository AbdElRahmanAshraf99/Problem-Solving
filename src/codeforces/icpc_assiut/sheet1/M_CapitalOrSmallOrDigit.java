package codeforces.icpc_assiut.sheet1;

import java.util.Scanner;

public class M_CapitalOrSmallOrDigit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char c = sc.next().charAt(0);
		if (Character.isDigit(c))
			System.out.println("IS DIGIT");
		else if (Character.isLetter(c)) {
			System.out.println("ALPHA");
			if (Character.isUpperCase(c))
				System.out.println("IS CAPITAL");
			else if (Character.isLowerCase(c))
				System.out.println("IS SMALL");
		}

	}
}
