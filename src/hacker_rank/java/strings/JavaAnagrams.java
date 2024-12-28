package hacker_rank.java.strings;

import utils.SortingAlgorithms;

import java.util.Scanner;

public class JavaAnagrams
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		scan.close();
		boolean ret = isAnagram(a, b);
		System.out.println((ret) ? "Anagrams" : "Not Anagrams");
	}

	private static boolean isAnagram(String a, String b)
	{
		char[] aChars = a.toCharArray();
		char[] bChars = b.toCharArray();
		if (aChars.length != bChars.length)
			return false;
		for (int i = 0; i < aChars.length; i++)
			aChars[i] = String.valueOf(aChars[i]).toLowerCase().charAt(0);
		for (int i = 0; i < bChars.length; i++)
			bChars[i] = String.valueOf(bChars[i]).toLowerCase().charAt(0);
		SortingAlgorithms.sortWithBubbleSort(aChars);
		SortingAlgorithms.sortWithBubbleSort(bChars);
		for (int i = 0; i < aChars.length; i++)
		{
			if (aChars[i] != bChars[i])
				return false;
		}
		return true;
	}

}
