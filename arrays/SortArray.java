import java.util.Arrays;
 
public class Main
{
     public static void main(String[] args)
    {
         int[] num_Array = {115,32,56,78,94,108,100,63};
         System.out.println("Original Array: " + Arrays.toString(num_Array));
 
         Arrays.sort(num_Array);
 
         System.out.println("Sorted Array: " + Arrays.toString(num_Array));
    }
}
