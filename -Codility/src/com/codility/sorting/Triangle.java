package com.codility.sorting;

import java.util.Arrays;

public class Triangle
{
	public static void main(String[] args)
	{
		int A[] = {10, 2, 5, 1, 8, 20};
		
		Arrays.sort(A);
		
		for(int i = 0; i < A.length - 2; i++)
		{
			if(A[i] > A[i + 2] - A[i + 1] && A[i] >= 0)
			{
				System.out.println("1");
				return;
			}
		}
		
		System.out.println("0");
	}
}
