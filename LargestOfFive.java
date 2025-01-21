/*************************************************************************
 *  Compilation:  javac LargestOfFive.java
 *  Execution:    java LargestOfFive 35 10 32 1 8
 *
 *  @author:
 *
 *  Takes five distinct integers as command-line arguments and prints the 
 *  largest value
 *
 *
 *  % java LargestOfFive 35 10 32 1 8
 *  35
 *
 *  Assume the inputs are 5 distinct integers.
 *  Print only the largest value, nothing else.
 *
 *************************************************************************/

public class LargestOfFive {

    public static void main (String[] args)
    {
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        int num3 = Integer.parseInt(args[2]);
        int num4 = Integer.parseInt(args[3]);
        int num5 = Integer.parseInt(args[4]);
        int highest = num1;

        if(num2 > highest)
        {
            highest = num2;
        }
        if(num3 > highest)
        {
            highest = num3;
        }
        if(num4 > highest)
        {
            highest = num4;
        }
        if(num5 > highest)
        {
            highest = num5;
        }
        System.out.println(highest);
       
        String s = "Hello World"; 
        s.toUpperCase(); 
        s.substring(6, 11); 
        StdOut.println(s);
    }
}