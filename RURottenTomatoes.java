/*************************************************************************
 *  Compilation:  javac RURottenTomatoes.java
 *  Execution:    java RURottenTomatoes
 *
 *  @author: Siddhant Kumta
 *
 * RURottenTomatoes creates a 2 dimensional array of movie ratings 
 * from the command line arguments and displays the index of the movie 
 * that has the highest sum of ratings.
 *
 *  java RURottenTomatoes 3 2 5 2 3 3 4 1
 *  0
 *************************************************************************/

public class RURottenTomatoes {

	public static void main(String[] args)
	{
		int review = Integer.parseInt(args[0]);
		int movie = Integer.parseInt(args[1]);
		int array[][] = new int[review][movie];
		int count = 2;
		int total = 0;
		int out = 0;
		for(int i = 0; i < review; i++)
		{
			for(int h = 0; h < movie; h++)
			{
				array[i][h] = Integer.parseInt(args[count]);
				count++;
			}
		}
		for(int i = 0; i < movie; i++)
		{
			int tmax = 0;
			for(int h = 0; h < review; h++)
			{
				tmax += array[h][i];
			}
			if(tmax > total)
			{
				total = tmax;
				out = i;
			}
			
		}
		System.out.println(out);
	}
}
