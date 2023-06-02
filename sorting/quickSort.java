package sorting;

public class quickSort {
    public static void main(String[] args) {
        int ar[] = {4, 6, 2, 5, 7, 9, 1, 3};
        int n= ar.length;
        System.out.println("Array before sorting: ");
        output(ar);
        quick(ar, 0, n-1);
        System.out.println("\nArray after sorting:");
        output(ar);

    }

    public static int partition(int ar[], int low, int high) {
        int pivot = ar[low];
        int i = low;
        int j = high;
        while(i < j) {
            while(ar[i] <= pivot && i <= high-1) {
                i++;
            }

            while(ar[j] > pivot && j>= low + 1) {
                j--;
            }

            if(i<j) {
                int temp = ar[i];
                ar[i] = ar[j];
                ar[j] = temp;
            }
        }
        int temp = ar[low];
        ar[low] = ar[j];
        ar[j] = temp;

        return j;
    }

    public static void quick(int ar[], int low, int high) {
        if(low < high) {
            int part = partition(ar, low, high);
            quick(ar, low, part-1);
            quick(ar, part+1, high);
        }
    }

    public static void output(int ar[]) {
        for (int i=0;i<ar.length;i++) {
            System.out.print(ar[i] + " ");
        }
    }
}
