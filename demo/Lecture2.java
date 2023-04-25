import java.util.Scanner;

public class Lecture2 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        // int a= in.nextInt();
        // int b= in.nextInt();
        // int c= in.nextInt();
        // int a= 45;
        // int b= 3455;
        // int c= 657;
        // int max= a;
        // if(b> max)
        // {
        //     max= b;
        // }
        // if(c> max)
        // {
        //     max= c;
        // }
        // int max= Math.max(c, Math.max(a, b));
        // System.out.println(max);

        /* 
        FIBONACCI SERIES
        int a = 0;
        int b= 1;
        System.out.print("Enter number of terms: ");   
        int n= in.nextInt();
        int count= 2;
        System.out.print(a + "\t");
        while(count<= n) {
            int prev = b;
            b= b + a;
            a= prev;
            count++;
            System.out.print(b + "\t");
        }
        */
        
        /* 
        OCCURENCES OF AN ELEMENT
        System.out.print("Enter a number: ");
        int num= in.nextInt();
        System.out.print("Enter digit you want to search: ");
        int digit= in.nextInt();
        int count= 0;
        while(num > 0) {
            int rem= num%10;
            if(rem == digit) {
                count++;
            }
            num= num/10;
        }
        
        System.out.println("Number of occurences: " + count);
        */

        /* 
        REVERSE OF A NUMBER
        System.out.print("Enter a number: ");
        int num= in.nextInt();
        int rev= 0;
        while(num > 0) {
            int rem = num%10;
            rev= rev*10+ rem;
            num= num/10;
        }

        System.out.println("Reversed number: " + rev);
        */

        in.close();
    }
}
