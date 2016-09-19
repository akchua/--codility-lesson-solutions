package com.codility.time_complexity;

public class PermMissingElem
{
	public static void main(String[] args)
	{
		int[] A = {2, 3, 5, 4};
		
		long total = 0;
		long max = 0;
		int highest = 0;
		
		for(int i : A)
		{
			total += i;
			if(i > highest)
			{
				highest = i;
			}
		}
		
		max = highest * (highest + 1) / 2;
		
		if(max == total) 
		{
			System.out.println("Output: " + (highest + 1));
		}
		else
		{
			System.out.println("Output: " + (max - total));
		}
	}
}
