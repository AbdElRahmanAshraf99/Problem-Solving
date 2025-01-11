package codeforces.icpc_assiut.contest1;

import java.math.*;
import java.util.Scanner;

public class H_DataTypeGuessing {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigDecimal n = BigDecimal.valueOf(sc.nextDouble());
		BigDecimal k = BigDecimal.valueOf(sc.nextDouble());
		BigDecimal a = BigDecimal.valueOf(sc.nextDouble());
		if (n.multiply(k).remainder(a).compareTo(BigDecimal.ZERO) != 0)
			System.out.println("double");
		else {
			BigDecimal divide = n.multiply(k).divide(a, RoundingMode.HALF_UP);
			if (divide.compareTo(BigDecimal.valueOf(Integer.MAX_VALUE)) > 0 || divide.compareTo(BigDecimal.valueOf(Integer.MIN_VALUE)) < 0)
				System.out.println("long long");
			else
				System.out.println("int");
		}
	}
}
