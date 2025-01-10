package codeforces.icpc_assiut.sheet1;

import java.util.Scanner;

public class W_MathematicalExpression {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String expression = in.nextLine();
		String[] split = expression.split(" ");
		long n1 = Long.parseLong(split[0].trim());
		String sign = split[1].trim();
		long n2 = Long.parseLong(split[2].trim());
		long result = Long.parseLong(split[4].trim());
		if (sign.equals("+")) {
			if (n1 + n2 == result)
				System.out.println("Yes");
			else
				System.out.println(n1 + n2);
		}
		else if (sign.equals("-")) {
			if (n1 - n2 == result)
				System.out.println("Yes");
			else
				System.out.println(n1 - n2);
		}
		if (sign.equals("*")) {
			if (n1 * n2 == result)
				System.out.println("Yes");
			else
				System.out.println(n1 * n2);
		}
	}
}
