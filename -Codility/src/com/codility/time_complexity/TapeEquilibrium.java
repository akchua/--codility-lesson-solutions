package com.codility.time_complexity;

public class TapeEquilibrium
{
	public static void main(String[] args)
	{	
		int[] A = {15, 7, 2, 4, 10};
		
		int total = 0;
        
        for(int i : A)
        {
            total += i;
        }
        
        int least = 0;
        int temp = 0, temp1 = 0;
        
        least = Math.abs(total - 2 * A[0]);
        
        for(int i : A)
        {
            temp1 += i;
            temp = Math.abs(total - 2 * temp1);
            if(temp < least)
            {
                least = temp;
            }
        }
		
		System.out.println("Output: " + least);
	}
}
