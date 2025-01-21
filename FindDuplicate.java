/*************************************************************************
 *  Compilation:  javac FindDuplicate.java
 *  Execution:    java FindDuplicate
 *
 *  @author: Siddhant Kumta ; ssk196
 *
 * FindDuplicate that reads n integer arguments from the command line 
 * into an integer array of length n, where each value is between is 1 and n, 
 * and displays true if there are any duplicate values, false otherwise.
 *
 *  % java FindDuplicate 10 8 5 4 1 3 6 7 9
 *  false
 *
 *  % java FindDuplicate 4 5 2 1 
 *  true
 *************************************************************************/

public class FindDuplicate {

	public static void main(String[] args) 
	{
		int n = args.length;
		int numbers[] = new int[n];
		int count = 0;

		for(int i = 0; i < n; i++)
		{
			numbers[i] = Integer.parseInt(args[i]);
		}

		for(int i = 0; i < numbers.length; i++)
		{
			for(int h = i + 1;h < numbers.length; h++)
			{
				if(numbers[i] == numbers[h])
				{
					count++;
				}
			}
		}
		
		if(count > 0)
		{
			System.out.print("true");
		}
		else
		{
			System.out.print("false");
		}
		
		
	}
}
