package codeforces.icpc_assiut.sheet1;

import java.util.Scanner;

public class L_TheBrothers {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String p1 = in.nextLine();
		String p2 = in.nextLine();
		String[] p1Names = p1.split(" ");
		String[] p2Names = p2.split(" ");
		if (p1Names.length < 2 || p2Names.length < 2)
			System.out.println("NOT");
		else if (!p1Names[1].equals(p2Names[1]))
			System.out.println("NOT");
		else
			System.out.println("ARE Brothers");
	}
}
