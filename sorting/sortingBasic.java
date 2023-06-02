package sorting;
import java.util.Scanner;
// for basic sorting techniques: selection, bubble, insertion
public class sortingBasic {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ar[] = {13, 46, 24, 52, 20, 9};
        int n= ar.length;
        // selection(ar, n);
        // bubble(ar, n);
        insertion(ar, n);
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

    public static void bubble(int ar[], int n) {
        for (int i = n-1; i>=0; i--) {
            for(int j = 0; j<=i-1; j++) {
                if(ar[j] > ar[j+1]) {
                    // swap
                    int temp = ar[j];
                    ar[j] = ar[j+1];
                    ar[j+1] = temp;
                }
            }

            output(ar);
            System.out.println();
        }
    }

    public static void insertion(int ar[], int n) {
        for (int i =0; i<=n-1; i++) {
            int j = i;
            while(j>0 && ar[j-1] > ar[j]) {
                int temp = ar[j];
                ar[j] = ar[j-1];
                ar[j-1] = temp;
                j--;
            }

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
