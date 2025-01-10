package codeforces.icpc_assiut.sheet1;

import java.util.Scanner;

public class X_TwoIntervals {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long x1 = in.nextLong();
		long y1 = in.nextLong();
		long x2 = in.nextLong();
		long y2 = in.nextLong();
		if (y1 < x2 || y2 < x1)
			System.out.println(-1);
		else
			System.out.println(Math.max(x1, x2) + " " + Math.min(y1, y2));
	}
}
