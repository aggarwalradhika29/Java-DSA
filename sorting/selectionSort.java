package sorting;
import java.util.Scanner;

public class selectionSort {

    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ar[] = {13, 46, 24, 52, 20, 9};
        int n= ar.length;
        selection(ar, n);
        in.close();
    }

    public static void selection(int ar[], int n) {
        for (int i=0; i<=n-2; i++)
        {
            int min = i;
            for(int j=i; j<=n-1;j++)
            {
                if(ar[j] < ar[min])
                {
                    min = j;
                }
            }
            // swap
            int temp = ar[i];
            ar[i] = ar[min];
            ar[min] = temp;

            output(ar);
            System.out.println();
        }
    }

    public static void output(int ar[]) {
        for (int i=0;i<ar.length;i++) {
            System.out.print(ar[i] + " ");
        }
    }



}
