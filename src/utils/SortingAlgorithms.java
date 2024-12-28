package utils;

public class SortingAlgorithms
{
	public static void sortWithBubbleSort(char[] aChars)
	{
		for (int i = 0; i < aChars.length; i++)
		{
			for (int j = i + 1; j < aChars.length; j++)
			{
				if (aChars[i] > aChars[j])
				{
					char temp = aChars[i];
					aChars[i] = aChars[j];
					aChars[j] = temp;
				}
			}
		}
	}

	public static void sortWithSelectionSort(char[] aChars)
	{
		for (int i = 0; i < aChars.length; i++)
		{
			int min_index = i;
			for (int j = i + 1; j < aChars.length; j++)
			{
				if (aChars[min_index] > aChars[j])
					min_index = j;
			}
			if (i != min_index)
			{
				char temp = aChars[i];
				aChars[i] = aChars[min_index];
				aChars[min_index] = temp;
			}
		}
	}

	public static void sortWithInsertionSortImp1(char[] aChars)
	{
		for (int i = 1; i < aChars.length; i++)
		{
			int naturalI = i;
			for (int j = i - 1; j >= 0; j--)
			{
				if (aChars[i] < aChars[j])
				{
					char temp = aChars[i];
					aChars[i] = aChars[j];
					aChars[j] = temp;
					i--;
				}
				else
				{
					break;
				}
			}
			i = naturalI;
		}
	}

	public static void sortWithInsertionSortImp2(char[] aChars)
	{
		for (int i = 1; i < aChars.length; i++)
		{
			char value = aChars[i];
			int j = i - 1;
			while (j >= 0 && aChars[j] > value)
			{
				aChars[j + 1] = aChars[j];
				j -= 1;
			}
			aChars[j + 1] = value;
		}
	}
}
