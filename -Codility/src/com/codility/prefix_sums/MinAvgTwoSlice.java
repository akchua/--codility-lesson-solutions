package com.codility.prefix_sums;

public class MinAvgTwoSlice
{
	public static void main(String[] args)
	{
		int[] A = {4, 2, 2, 3, 3, 1, 1};
		
		double leastValue = (A[0] + A[1]) / 2.0;
		double current = 0;
		int leastLocation = 0;
		
		for(int i = 0; i < A.length - 2; i++)
		{
			current = (A[i] + A[i + 1] + A[i + 2]) / 3.0;
			if(current < leastValue)
			{
				leastValue = current;
				leastLocation = i;
			}
			current = (A[i + 1] + A[i + 2]) / 2.0;
			if(current < leastValue)
			{
				leastValue = current;
				leastLocation = i + 1;
			}
		}
		
		System.out.println("Output: " + leastLocation);
	}
}
