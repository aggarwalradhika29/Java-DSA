package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Lecture1 {
    public static void main(String[] args) {
        // int r1 = 1;
        // int r2 = 2;
        // int r3 = 3;
        // int[] rnos = {r1, r2, r3};
        // System.out.println(rnos[0]);
        int[] a= {1, 2, 3, 4, 5};
        // for(int num : a) {
        //     System.out.println(num);
        // }
        // System.out.println(Arrays.toString(a));
        Scanner in = new Scanner(System.in);

        String[] s = new String[10];
        for (int i = 0; i < s.length; i++) {
            s[i] = in.next();
        }
        System.out.println(Arrays.toString(s));
        in.close();
    }
    
}
