package codeforces.icpc_assiut.sheet1;

import java.util.*;

public class T_SortNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n1 = sc.nextLong();
		long n2 = sc.nextLong();
		long n3 = sc.nextLong();
		long[] arr = new long[] { n1, n2, n3 };
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					long temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		Arrays.stream(arr).forEach(System.out::println);
		System.out.println("\n" + n1);
		System.out.println(n2);
		System.out.println(n3);
	}
}
