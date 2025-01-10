package codeforces.icpc_assiut.sheet1;

import java.util.Scanner;

public class R_AgeInDays {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long input = sc.nextLong();
		long years = 0, months = 0, days = 0;
		while (input > 0) {
			if (input >= 365) {
				years++;
				input -= 365;
			}
			else if (input >= 30) {
				months++;
				input -= 30;
			}
			else {
				days += input;
				input = 0;
			}
		}
		System.out.println(years + " years");
		System.out.println(months + " months");
		System.out.println(days + " days");
	}
}
