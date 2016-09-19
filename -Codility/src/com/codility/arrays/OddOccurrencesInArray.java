package com.codility.arrays;

import java.util.HashSet;

public class OddOccurrencesInArray
{
	public static void main(String[] args)
	{
		int A[] = {9, 3, 9, 3, 9, 7, 9};
		
		int total = 0;
		
		HashSet<Integer> list = new HashSet<Integer>();
		
		for(int i : A)
		{
			if(list.contains(i))
			{
				total -= i;
				list.remove(i);
			}
			else
			{
				total += i;
				list.add(i);
			}
		}
		
		System.out.println(total);
	}
}
