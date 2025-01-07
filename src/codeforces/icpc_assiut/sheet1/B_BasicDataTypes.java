package codeforces.icpc_assiut.sheet1;

import java.util.Scanner;

public class B_BasicDataTypes {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String values = in.nextLine();
		String[] split = values.split(" ");
		System.out.println(Integer.parseInt(split[0]));
		System.out.println(Long.parseLong(split[1]));
		System.out.println(split[2].charAt(0));
		System.out.println(Float.parseFloat(split[3]));
		System.out.println(Double.parseDouble(split[4]));
	}
}
