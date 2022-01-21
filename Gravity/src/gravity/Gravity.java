// Oliver Greene, CSC 210 - Spring, Quiz 6 - Force, April 26, 2021

package gravity;

public class Gravity {
       public final double g = 6.673e-11;
       public double m1;
       public double m2;
       public double r;
    

    public static void main(String[] args) {
        System.out.print (calcForce (5000000.0, 700000.0, 750060.5) + " Newtons ");
    }
    
    public static double calcForce(double m1, double m2, double r) {  
    final double g = 6.673e-11;
    double f = (g * m1 * m2)/(r * r);
    if (m1 <= 0 || m2 <= 0 || r < 0) {
        throw new IllegalArgumentException( "Well, rats. At least one invalid argument was provided.");
    }
    else {   
       return (f);
    }    
}
    
    
}
