package codeforces.icpc_assiut.sheet1;

import java.util.Scanner;

public class S_Interval {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double n = in.nextDouble();
		if (n < 0 || n > 100)
		{
			System.out.println("Out of Intervals");
			return;
		}
		String interval;
		if (n == 25 || n < 25)
			interval = "[0,25]";
		else if (n <= 50)
			interval = "(25,50]";
		else if (n <= 75)
			interval = "(50,75]";
		else
			interval = "(75,100]";
		System.out.println("Interval " + interval);
	}
}
