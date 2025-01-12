package codeforces.icpc_assiut.sheet2;

import java.util.Scanner;

public class C_EvenOddPositiveAndNegative {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int evenCount = 0;
		int positiveCount = 0;
		int negativeCount = 0;
		for (int i = 0; i < n; i++) {
			int element = sc.nextInt();
			if (element % 2 == 0)
				evenCount++;
			if (element > 0)
				positiveCount++;
			else if (element < 0)
				negativeCount++;
		}
		System.out.println("Even: " + evenCount);
		System.out.println("Odd: " + (n - evenCount));
		System.out.println("Positive: " + positiveCount);
		System.out.println("Negative: " + negativeCount);
	}
}
