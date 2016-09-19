package com.codility.counting_elements;

public class PermCheck
{
	public static void main(String[] args)
	{
		int[] A = new int[] {1, 5, 5, 5, 3, 2};
		
		boolean[] check = new boolean[A.length];
		long total = 0;
		
		total = A.length * (A.length + 1) / 2;
		
		for(int i : A)
		{
			if(i <= A.length && check[i - 1] == false)
			{
				total -= i;
				check[i - 1] = true;
			}

			else break;
		}
		
		if(total == 0) 
		{
			System.out.println("Output: 1");
		}

		else
		{
			System.out.println("Output: 0");
		}
	}
}
