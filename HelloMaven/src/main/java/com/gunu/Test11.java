package com.gunu;

public class Test11 {

	public static void main(String[] args) 
	{
		System.out.println(test112());
	}
	
	public static int test112()
	{
		try
		{
			throw new Exception();
		}
		catch(Exception ee)
		{
			System.out.println("catch...");
			//System.exit(0);
			return 1;
		}
		finally
		{
			System.out.println("finally...");
			return 2;
		}
	}

}
