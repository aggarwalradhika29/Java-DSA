package functions;
import java.util.Scanner;

public class TripletPyth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter P: ");
        double p = in.nextDouble();
        System.out.print("Enter B: ");
        double b = in.nextDouble();
        System.out.print("Enter H: ");
        double h = in.nextDouble();

        boolean result = isPythagoreanTriplet(p, b, h);
        if(result) {
            System.out.println("Parameters make a pythagorean triplet.");
        }
        else {
            System.out.println("Parameters don't make a pythagorean triplet.");
        }
        in.close();
    }

    static boolean isPythagoreanTriplet(double p, double b, double h) {
        boolean result = false;
        double p2 = Math.pow(p, 2);
        double b2 = Math.pow(b, 2);
        double h2 = Math.pow(h, 2);
        double sum = p2 + b2;
        if(h2 == sum) {
            result = true;
        }
        else
            result = false;
        
        return result;
    }
    
}
