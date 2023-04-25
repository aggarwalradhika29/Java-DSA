package functions;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n= in.nextInt();
        boolean result = isPalindrome(n);
        if(result) {
            System.out.println("Number and its palindrome are same.");
        }
        else
            System.out.println("Oops! Number and its palindrome are not same.");
        in.close();
    }

    static boolean isPalindrome(int n) {
        boolean result= false;
        int palin= 0;
        int temp = n;
        while(n>0) {
            int rem= n % 10;
            palin= palin * 10 + rem;
            n = n / 10;
        }
        System.out.println("Palindrome is : " + palin);
        if(palin == temp) {
            result = true;
        }
        else {
            result = false;
        }

        return result;
    }
    
}
