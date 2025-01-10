package codeforces.icpc_assiut.sheet1;

import java.util.Scanner;

public class Q_CoordinatesOfAPoint {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n1 = sc.nextDouble();
		double n2 = sc.nextDouble();
		if (n1 == 0 || n2 == 0) {
			if (n1 != 0)
				System.out.println("Eixo X");
			else if (n2 != 0)
				System.out.println("Eixo Y");
			else
				System.out.println("Origem");
		}
		else if (n1 > 0) {
			if (n2 > 0)
				System.out.println("Q1");
			else
				System.out.println("Q4");
		}
		else {
			if (n2 > 0)
				System.out.println("Q2");
			else
				System.out.println("Q3");
		}
	}
}
