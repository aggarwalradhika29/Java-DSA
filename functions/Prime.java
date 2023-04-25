package functions;
import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter num1 : ");
        int num1 = in.nextInt();
        System.out.print("Enter num2 : ");
        int num2 = in.nextInt();
        System.out.println("All prime numbers between " + num1 + " & " + num2 + ":");
        primeNum(num1, num2);
        in.close();
    }

    static void primeNum(int num1, int num2) {
         
    }
    
}
