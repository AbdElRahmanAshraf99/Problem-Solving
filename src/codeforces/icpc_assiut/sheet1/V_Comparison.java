package codeforces.icpc_assiut.sheet1;

import java.util.Scanner;

public class V_Comparison {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String[] split = input.split("[<>=]");
		int firstInteger = Integer.parseInt(split[0].trim());
		int lastInteger = Integer.parseInt(split[1].trim());
		if (input.contains("<"))
			System.out.println(firstInteger < lastInteger ? "Right" : "Wrong");
		else if (input.contains(">"))
			System.out.println(firstInteger > lastInteger ? "Right" : "Wrong");
		else
			System.out.println(firstInteger == lastInteger ? "Right" : "Wrong");
	}
}
