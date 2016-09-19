package com.codility.sorting;

import java.util.Arrays;

public class MaxProductOfThree
{
	public static void main(String[] args)
	{
		int A[] = {-3, 1, 2, -2, 5, 6};
		
		int temp = 0;
		int temp2 = 0;
		
		Arrays.sort(A);
		
		temp = A[0] * A[1] * A[A.length - 1];
		temp2 = A[A.length - 1] * A[A.length - 2] * A[A.length - 3];
		
		if(temp > temp2) System.out.println(temp);
		else System.out.println(temp2);
	}
}
