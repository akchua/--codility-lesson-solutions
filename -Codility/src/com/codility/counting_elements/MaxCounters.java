package com.codility.counting_elements;

import java.util.Arrays;

public class MaxCounters
{
	public static void main(String[] args)
	{
		int N = 5;
		int[] A = new int[] {6, 4, 6, 2, 6, 3, 5};
		
		int highest = 0;
		int total = 0;
		boolean check = false;
		int[] counter = new int[N];
		
		for(int i : A)
		{
			if(i > N && check == false)
			{
				total += highest;
				highest = 0;
				counter = new int[N];
				check = true;
			}
			else if(i <= N)
			{
				counter[i - 1]++;
				if(counter[i - 1] > highest)
				{
					highest = counter[i - 1];
					check = false;
				}
			}
		}
		
		if(total != 0)
		{
			for(int i = 0; i < N; i++)
			{
				counter[i] += total;
			}
		}
		
		System.out.println("Output: " + Arrays.toString(counter));
	}
}
