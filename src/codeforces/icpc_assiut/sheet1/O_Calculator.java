package codeforces.icpc_assiut.sheet1;

import java.util.Scanner;

public class O_Calculator {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String n = in.nextLine();
		String[] digits = n.split("[+\\-*/]");
		if (n.contains("+")) {
			System.out.println(Long.parseLong(digits[0]) + Long.parseLong(digits[1]));
		}
		else if (n.contains("-")) {
			System.out.println(Long.parseLong(digits[0]) - Long.parseLong(digits[1]));
		}
		else if (n.contains("*")) {
			System.out.println(Long.parseLong(digits[0]) * Long.parseLong(digits[1]));
		}
		else if (n.contains("/")) {
			System.out.println(Long.parseLong(digits[0]) / Long.parseLong(digits[1]));
		}
	}
}
