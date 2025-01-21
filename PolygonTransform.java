/*************************************************************************
 *  Compilation:  javac PolygonTransform.java
 *  Execution:    java PolygonTransform
 *
 *  @author: Siddhant Kumta
 *
 *************************************************************************/

public class PolygonTransform {


    // Returns a new array that is an exact copy of the given array. 
    // The given array is not mutated. 
    public static double[] copy(double[] array) 
    {
        double[] nArray = new double[array.length];

        for(int i = 0; i < array.length; i++)
        {
            nArray[i] = array[i];
            
        }
        return nArray;
    }
    
    // Scales the given polygon by the factor alpha. 
    public static void scale(double[] x, double[] y, double alpha) 
    {
       for(int h = 0; h < x.length; h ++)
        {
            x[h] *= alpha;
            y[h] *= alpha;
        }
    }
    
    // Translates the given polygon by (dx, dy). 
    public static void translate(double[] x, double[] y, double dx, double dy) 
    {
        for(int i = 0; i < x.length; i++)
        {
            y[i] = y[i] + dy;
            x[i] = x[i] + dx;
        }
	
    }
    
    // Rotates the given polygon theta degrees counterclockwise, about the origin. 
    public static void rotate(double[] x, double[] y, double theta)
    {
        double t;
        double radians = Math.toRadians(theta);
        
        for(int i = 0; i < x.length; i++)
        {
            t = x[i];
            x[i] = x[i] * Math.cos(radians) - y[i] * Math.sin(radians);
            y[i] = y[i] * Math.cos(radians) + t * Math.sin(radians);
        }
	
    }

    // Tests each of the API methods by directly calling them. 
    public static void main(String[] args) 
    {
       // Translates polygon by (2, 1).
StdDraw.setScale(-5.0, +5.0); 
double[] x = { 0, 1, 1, 0 }; 
double[] y = { 0, 0, 2, 1 }; 
double dx = 2.0, dy = 1.0; 
StdDraw.setPenColor(StdDraw.RED); 
StdDraw.polygon(x, y); 
translate(x, y, dx, dy); 
StdDraw.setPenColor(StdDraw.BLUE);
StdDraw.polygon(x, y);
    }
}
