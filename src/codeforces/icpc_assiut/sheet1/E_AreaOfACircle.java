package codeforces.icpc_assiut.sheet1;

import java.util.Scanner;

public class E_AreaOfACircle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double radius = sc.nextDouble();
		Double area = 3.141592653 * Math.pow(radius, 2);
		System.out.printf("%.9f%n", area);
	}
}
