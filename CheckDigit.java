/*************************************************************************
 *  Compilation:  javac CheckDigit.java
 *  Execution:    java CheckDigit 020131452
 *
 *  @author:
 *
 *  Takes a 12 or 13 digit integer as a command line argument, then computes
 *  and displays the check digit
 *
 *  java CheckDigit 048231312622
 *  0
 *
 *  java 
 * 
 *  java CheckDigit 9780470454310
 *  8
 * 
 *  Print only the check digit character, nothing else.
 *
 *************************************************************************/

public class CheckDigit {

    public static void main (String[] args) 
    {
        long code = Long.parseLong(args[0]);
        long sumEven = 0;
        long sumOdd = 0;
        long rem;
        long digit;
        int count = 1;
        long total = 0;

        while(code % 10 >= 0)
        {
            if(count % 2 == 0)
            {
                rem = code % 10;
                digit = code / 10;
                code =(code - code % 10)/10;
                sumEven = digit + rem;
                count++;
            }
            else
            {
                code = code / 10;
                count++;
            }
        }
        while(code % 10 >= 0)
        {
            if(count % 10 != 0)
            {
                rem = code % 10;
                digit = code / 10;
                code =(code - code % 10)/10;
                sumOdd = digit + rem;
                count++;
            }
            else
            {
                code = code / 10;
                count++;
            }
        }
        sumEven = sumEven % 10;
        sumOdd = sumOdd * 3;
        sumOdd = sumOdd % 10;

        total = sumOdd + sumEven;
        total = total % 10;
        System.out.println(total);
    }
}