package codeforces.icpc_assiut.sheet1;

import java.util.Scanner;

public class U_FloatOrInt {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double doubleNum = sc.nextDouble();
		long longNum = (long) doubleNum;
		double afterDot = doubleNum - longNum;
		if (afterDot > 0)
			System.out.println("float " + longNum + " 0." + String.valueOf(doubleNum).split("\\.")[1]);
		else
			System.out.println("int " + longNum);
	}
}
