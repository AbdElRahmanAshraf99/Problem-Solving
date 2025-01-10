package codeforces.icpc_assiut.sheet1;

import java.util.Scanner;

public class P_FirstDigit {
	public static void main(String[] args) {
		long input = new Scanner(System.in).nextLong();
		if (Integer.parseInt(String.valueOf(String.valueOf(input).charAt(0))) % 2 == 0)
			System.out.println("EVEN");
		else
			System.out.println("ODD");
	}
}
