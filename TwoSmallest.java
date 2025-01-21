/*************************************************************************
 *  Compilation:  javac TwoSmallest.java
 *  Execution:    java TwoSmallest 1.1 6.9 0.3
 *
 *  @author:
 *
 *  The program TwoSmallest takes a set of double command-line
 *  arguments and prints the smallest and second-smallest number, in that
 *  order. It is possible for the smallest and second-smallest numbers to
 *  be the same (if the sequence contains duplicate numbers).
 *
 *  Note: display one number per line
 *
 *  % java TwoSmallest 17.0 23.0 5.0 1.1 6.9 0.3
 *  0.3
 *  1.1
 *
 *  % java TwoSmallest 17.0 23.0 5.0 1.1 6.9 0.3
 *  0.3
 *  0.3
 *************************************************************************/

public class TwoSmallest {

    public static void main(String[] args) 
    {
        double lowest = Double.parseDouble(args[0]);
        double lowest2 = Double.parseDouble(args[1]);

        for(int x = 2; x < args.length; x++)
        {
            double values = Double.parseDouble(args[x]);
            if(values < lowest)
            {
                lowest2 = lowest;
                lowest = values; 
            }
            else if (values < lowest2)
            {
              lowest2 = values;
            }

        }
        System.out.println(lowest);
        System.out.println(lowest2);
    }

}
