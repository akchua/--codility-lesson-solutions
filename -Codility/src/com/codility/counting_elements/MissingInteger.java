package com.codility.counting_elements;

public class MissingInteger
{
	public static void main(String[] args)
	{
		int[] A = {-3, 1, 4, 5, 3, 6};
		
		int count = 0;
		boolean[] B = new boolean[A.length + 2];
		
		for(int i : A)
		{
			if(i <= A.length && i > 0) B[i] = true;
		}
		
		while(B[++count] == true);
		
		System.out.println("Output: " + count);
	}
}
