import java.util.Scanner;

public class reverseArray {
    
     public static void main(String[] args)
    {
       
          Scanner s = new Scanner(System.in);
          int size = s.nextInt();
           int [] arr = new int[size];
         for (int k = 0; k < size; k++) {
              arr[k] = s.nextInt();
        }
        reverse(arr, arr.length);
    }

    static void reverse(int a[], int n)
    {
        int[] b = new int[n];
        int j = n;
        for (int i = 0; i < n; i++) {
            b[j - 1] = a[i];
            j = j - 1;
        }
        for (int k = 0; k < n; k++) {
            System.out.print(b[k] + " ");
        }
    }
}
