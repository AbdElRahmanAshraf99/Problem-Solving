package codeforces.icpc_assiut.sheet2;

import java.util.Scanner;

public class H_OnePrime {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long number = in.nextLong();
		System.out.println(isPrime(number) ? "YES" : "NO");
	}

	public static boolean isPrime(long number) {
		if (number <= 1)
			return false;
		if (number == 2 || number == 3)
			return true;
		if (number % 2 == 0 || number % 3 == 0)
			return false;
		for (int i = 5; (long) i * i <= number; i += 6) {
			if (number % i == 0 || number % (i + 2) == 0)
				return false;
		}
		return true;
	}
}
