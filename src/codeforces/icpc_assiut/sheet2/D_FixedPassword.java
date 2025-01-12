package codeforces.icpc_assiut.sheet2;

import java.util.Scanner;

public class D_FixedPassword {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (true) {
			int input = in.nextInt();
			if (input == 1999) {
				System.out.println("Correct");
				break;
			}
			else {
				System.out.println("Wrong");
			}
		}
	}
}
