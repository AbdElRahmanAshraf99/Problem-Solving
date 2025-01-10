package codeforces.icpc_assiut.sheet1;

import java.math.BigInteger;
import java.util.Scanner;

public class Y_TheLast2Digits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger n1 = new BigInteger(sc.next());
		BigInteger n2 = new BigInteger(sc.next());
		BigInteger n3 = new BigInteger(sc.next());
		BigInteger n4 = new BigInteger(sc.next());
		BigInteger result = n1.multiply(n2).multiply(n3).multiply(n4);
		String stringValue = String.valueOf(result);
		System.out.println(stringValue.substring(stringValue.length() - 2));
	}
}
