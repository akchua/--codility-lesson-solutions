package com.codility.prefix_sums;

public class CountDiv
{
	public static void main(String[] args)
	{
		int A = 3;
		int B = 4;
		int K = 2;
		
		while(A % K != 0) A++;
		while(B % K != 0) B--;
		
		System.out.println("Output: " + ((B - A) / K + 1));
	}
}
