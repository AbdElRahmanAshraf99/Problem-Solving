package codeforces.icpc_assiut.sheet2;

import java.util.Scanner;

public class J_PrimeFrom1ToN {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long n = in.nextLong();
		StringBuilder builder = new StringBuilder("2 3");
		if (n < 2) {
			return;
		}
		if (n == 2) {
			System.out.println("2");
			return;
		}
		if (n == 3) {
			System.out.println(builder);
			return;
		}
		if (n < 5) {
			System.out.println(builder);
			return;
		}
		for (long i = 5; i <= n; i++) {
			if (isPrime(i))
				builder.append(" ").append(i);
		}
		System.out.println(builder);
	}

	public static boolean isPrime(long number) {
		if (number % 2 == 0 || number % 3 == 0)
			return false;
		for (int i = 5; (long) i * i <= number; i += 6) {
			if (number % i == 0 || number % (i + 2) == 0)
				return false;
		}
		return true;
	}
}
