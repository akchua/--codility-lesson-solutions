package com.codility.sorting;

import java.util.HashSet;

public class Distinct
{
	public static void main(String[] args)
	{
		int A[] = {2, 1, 1, 2, 3, 1};
		
		HashSet<Integer> list = new HashSet<Integer>();
		
		for(int i : A) list.add(i);
		
		System.out.println(list.size());
	}
}
