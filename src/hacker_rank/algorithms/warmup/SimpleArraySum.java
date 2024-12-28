package hacker_rank.algorithms.warmup;

import java.util.*;

public class SimpleArraySum {
	public static int simpleArraySum(List<Integer> ar) {
		return ar.stream().reduce(0, Integer::sum);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arCount = sc.nextInt();
		List<Integer> ar = new ArrayList<>();
		for (int i = 0; i < arCount; i++)
			ar.add(sc.nextInt());
		int result = simpleArraySum(ar);
		System.out.println(result);
		sc.close();
	}
}
