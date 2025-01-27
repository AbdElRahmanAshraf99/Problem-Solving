package codeforces.icpc_assiut.sheet2;

import java.util.Scanner;

public class I_Palindrome {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long number = in.nextLong();
		long withoutZeros = number;
		while (withoutZeros % 10 == 0) {
			withoutZeros /= 10;
		}
		String string = String.valueOf(withoutZeros);
		char[] charArray = string.toCharArray();
		for (int i = 0; i < charArray.length / 2; i++) {
			int j = charArray.length - 1 - i;
			char c1 = charArray[i];
			charArray[i] = charArray[j];
			charArray[j] = c1;
		}
		System.out.println(String.valueOf(charArray));
		System.out.println(isPalindrome(number) ? "YES" : "NO");
	}

	private static boolean isPalindrome(long number) {
		char[] originalArr = String.valueOf(number).toCharArray();
		boolean isPalindrome = true;
		for (int i = 0; i < originalArr.length / 2; i++) {
			int j = originalArr.length - 1 - i;
			if (originalArr[i] != originalArr[j]) {
				isPalindrome = false;
				break;
			}
		}
		return isPalindrome;
	}

	private static boolean isPalindrome2(long number) {
		String original = String.valueOf(number);
		StringBuilder reversed = new StringBuilder(original).reverse();
		return original.contentEquals(reversed);
	}

	private static boolean isPalindrome3(long number) {
		long originalNumber = number;
		long reversedNumber = 0;
		while (number != 0) {
			long digit = number % 10;
			reversedNumber = reversedNumber * 10 + digit;
			number = number / 10;
		}
		return originalNumber == reversedNumber;
	}
}
