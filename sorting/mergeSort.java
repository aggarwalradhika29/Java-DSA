package sorting;
import java.util.ArrayList;

public class mergeSort {
    public static void main(String[] args) {
        int ar[] = {13, 46, 24, 52, 20, 9};
        int n= ar.length;
        System.out.println("Array before sorting: ");
        output(ar);
        sort(ar, 0, n-1);
        System.out.println("\nArray after sorting:");
        output(ar);

    }

    public static void sort(int ar[], int low, int high) {
        if (low >= high) {
            return;
        }

        int mid = (low + high) / 2;
        sort(ar, low, mid);
        sort(ar, mid+1, high);

        merge(ar, low, mid, high);
    }

    public static void merge(int ar[], int low, int mid, int high) {
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid+1;

        while(left <= mid && right <= high) {
            if(ar[left] <= ar[right]) {
                temp.add(ar[left]);
                left++;
            }
            else {
                temp.add(ar[right]);
                right++;
            }
        }

        while(left<=mid) {
            temp.add(ar[left]);
            left++;
        }

        while(right<=high) {
            temp.add(ar[right]);
            right++;
        }

        for(int i = low; i <= high; i++) {
            ar[i] = temp.get(i-low);
        }
    }

    public static void output(int ar[]) {
        for (int i=0;i<ar.length;i++) {
            System.out.print(ar[i] + " ");
        }
    }
}
