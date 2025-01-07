package codeforces.icpc_assiut.sheet1;

import java.math.*;
import java.util.Scanner;

public class H_TwoNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n1 = sc.nextLong();
		long n2 = sc.nextLong();
		BigDecimal result = BigDecimal.valueOf(((double) n1 / n2));
		System.out.println("floor " + n1 + " / " + n2 + " = " + result.setScale(0, RoundingMode.FLOOR));
		System.out.println("ceil " + n1 + " / " + n2 + " = " + result.setScale(0, RoundingMode.CEILING));
		System.out.println("round " + n1 + " / " + n2 + " = " + result.setScale(0, RoundingMode.HALF_UP));
	}
}
