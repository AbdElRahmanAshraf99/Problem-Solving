package codeforces.icpc_assiut.contest1;

import java.math.*;
import java.util.Scanner;

public class A_WinterSale {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double discountPercentage = sc.nextDouble();
		double priceAfterDiscount = sc.nextDouble();
		BigDecimal beforeDiscount = new BigDecimal(priceAfterDiscount / (1 - (discountPercentage / 100))).setScale(2, RoundingMode.HALF_UP);
		System.out.println(beforeDiscount);
	}
}
