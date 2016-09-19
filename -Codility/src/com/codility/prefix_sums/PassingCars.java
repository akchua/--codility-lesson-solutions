package com.codility.prefix_sums;

public class PassingCars
{
	public static void main(String[] args)
	{
		int[] A = {1, 0, 0, 0, 1};
		
		int count = 0;
		int total = 0;
		
		for(int i : A)
		{
			if(i == 0) count++;
			else total += count;
		}
		
		System.out.println("Output: " + total);
	}
}
