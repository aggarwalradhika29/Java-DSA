package functions;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Enter the number n: ");
        int n= in.nextInt();
        System.out.println("Factorial of " + n + ": " + factorial(n));
        in.close();
    }

    static int factorial(int n) {
        int fact = 1;
        
        for(int i=1; i<=n; i++) {
            fact= fact * i;
        }
        return fact;
    }
    
}
