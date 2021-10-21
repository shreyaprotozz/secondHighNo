package com.demo.secondHighNo.main;

import java.util.Arrays;

public class SecondHighNo {
	//function to swap two digit
		public char[] swapChars(char ar[], int i, int j)
		{
			char temp = ar[i];
			ar[i] = ar[j];
			ar[j] = temp;
			return ar;
		}
		public char[] findHighNumber(String inputArr)
		{
			int n = inputArr.length();
			char ar[] = inputArr.toCharArray();
            
			int i;
			for (i = n - 1; i > 0; i--)
			{
				if (ar[i] > ar[i - 1]) {
					break;
				}
			}
			if (i == 0)
			{
				System.out.println("already the highest num with the given digits");
			}
			else
			{
				int x = ar[i - 1], min = i;
			
				for (int j = i + 1; j < n; j++)
				{
					if (ar[j] > x && ar[j] < ar[min])
					{
						min = j;
					}
				}
				ar = swapChars(ar, i - 1, min);
				Arrays.sort(ar, i, n);
				System.out.println("Next Higher Num : ");
				for (i = 0; i < n; i++)
					System.out.print(ar[i]);
			}
			return ar;

		}


}
