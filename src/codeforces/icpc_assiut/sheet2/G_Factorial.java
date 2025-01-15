package codeforces.icpc_assiut.sheet2;

import java.util.Scanner;

public class G_Factorial {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String output = "";
		for (int i = 0; i < n; i++) {
			int number = in.nextInt();
			long factorial = 1;
			while (number > 1) {
				factorial *= number;
				number--;
			}
			if (i > 0)
				output += "\n";
			output += factorial;
		}
		System.out.println(output);
	}
}
