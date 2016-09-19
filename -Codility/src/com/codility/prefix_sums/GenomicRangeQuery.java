package com.codility.prefix_sums;

import java.util.Arrays;

public class GenomicRangeQuery
{
	public static void main(String[] args)
	{
		String S = new String("CAGCCTA");
		int[] P = {2, 5, 0};
		int[] Q = {4, 5, 6};
		
		int[] result = new int[P.length];
		int[] current = new int[4];
		int[][] memory = new int[S.length() + 1][4];
		
		for(int i = 0; i < S.length(); i++)
		{
			if(S.charAt(i) == 'A')
			{
				current[0]++;
			}
			else if(S.charAt(i) == 'C')
			{
				current[1]++;
			}
			else if(S.charAt(i) == 'G')
			{
				current[2]++;
			}
			else if(S.charAt(i) == 'T')
			{
				current[3]++;
			}
			
			memory[i + 1] = current.clone();
		}

		for(int i = 0; i < P.length; i++)
		{
			for(int j = 0; j < 4; j++)
			{
				if(memory[Q[i] + 1][j] - memory[P[i]][j] != 0)
				{
					result[i] = j + 1;
					break;
				}
			}
		}
		
		System.out.println("Output: " + Arrays.toString(result));
	}
}
