package com.codility.time_complexity;

public class FrogJmp
{
	public static void main(String[] args)
	{
		int X = 3;
		int Y = 20;
		int D = 5;
		
		int count = 0;
        
        count = (int) Math.ceil((Y - X) / (double) D);
        
        System.out.println("Output: " + count);
	}

}
