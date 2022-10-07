import java.util.*;
import java.io.*;
import java.lang.*;

class Funrag
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
            
            for(int i = 0; i < n ; i++)
                arr[i] = sc.nextInt();

            System.out.println(new Solution().smallestSumSubarray(arr,n));
        }
    }
}

class Solution
{
    static int smallestSumSubarray(int a[], int size)
    {
         int sum  = Integer.MAX_VALUE;
        int minSum = Integer.MAX_VALUE;
        int cSum = 0;
        
        for(int i = 0; i < size; i++)
        {
            
            cSum = Math.min(cSum +a[i],a[i]);
            sum = Math.min(cSum,sum);
            
        }
        return sum;
    }
}