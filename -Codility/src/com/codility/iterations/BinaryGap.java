package com.codility.iterations;

public class BinaryGap
{
	private int maxGap;
	private int currentGap;
	private int temp;
	
	public static void main(String... args)
	{
		int N = 529;
		
		BinaryGap bg = new BinaryGap();
		
		bg.countGap(N);
		System.out.println(bg.getMaxGap());
	}
	
	public void countGap(int value)
	{
		if(value >= 2)
		{
			countGap(value / 2);
		}
		
		temp = value % 2;
		
		if(temp == 0) currentGap++;
		else 
		{
			if(currentGap > maxGap) maxGap = currentGap;
			currentGap = 0;
		}
	}
	
	public int getMaxGap()
	{
		return this.maxGap;
	}
}
