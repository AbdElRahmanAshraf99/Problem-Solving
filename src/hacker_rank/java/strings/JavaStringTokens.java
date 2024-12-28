package hacker_rank.java.strings;

import java.util.Scanner;

public class JavaStringTokens
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		s = s.trim();
		if (s.isEmpty())
		{
			System.out.println(0);
		}
		else
		{
			String[] split = s.split("[ !,?._'@]+");
			System.out.println(split.length);
			for (String string : split)
				System.out.println(string);
		}
		scan.close();
	}
}
